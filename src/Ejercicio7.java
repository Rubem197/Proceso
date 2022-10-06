import java.io.IOException;
import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        ProcessBuilder pb1 = new ProcessBuilder("java", "Clase1");
        ProcessBuilder pb2 = new ProcessBuilder("java", "Clase1");
        ProcessBuilder pb3 = new ProcessBuilder("java", "Clase1");

        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);

        try {
            ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
