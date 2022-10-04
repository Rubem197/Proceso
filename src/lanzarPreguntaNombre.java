import java.io.File;

public class lanzarPreguntaNombre {
    public static void main(String[] args) {

        File fichero = new File("Entrada.txt");

        ProcessBuilder pb = new ProcessBuilder(args);
        pb.command("java", "preguntaNombre");
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectInput(fichero);
        try {
            Process p = pb.start();
        }catch (Exception e){

        }
    }
}
