import java.io.File;
import java.io.IOException;
import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        ProcessBuilder pb1 = new ProcessBuilder("java", "Clase1");
        ProcessBuilder pb2 = new ProcessBuilder("java", "Clase2");
        ProcessBuilder pb3 = new ProcessBuilder("java", "Clase3");
        File fichero = new File("C:\\Users\\rlindes\\IdeaProjects\\Proceso\\src\\SalidaE7.txt");
        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
        pb1.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb2.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb3.redirectOutput(fichero);
        try {
            ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
