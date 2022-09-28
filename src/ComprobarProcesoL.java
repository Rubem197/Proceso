import java.io.IOException;

public class ComprobarProcesoL {
    public static void main(String[] args) throws IOException {


        ProcessBuilder pb = new ProcessBuilder(args);

        pb.command("java", "ProcesoLento");

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