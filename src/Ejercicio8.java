import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File fSalida= new File("C:\\Users\\rlindes\\IdeaProjects\\Proceso\\salidaProcesoLento.txt");

        ProcessBuilder pb = new ProcessBuilder(args);
        pb.command("java", "ProcesoLento");
        pb.redirectOutput(fSalida);
        Process p = pb.start();
        while (p.isAlive()) {
            try {
                System.out.println(p.isAlive());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
