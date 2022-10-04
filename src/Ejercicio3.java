import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el comando de ejecucion:");
        String[] comando = sc.nextLine().split(" ");

        ProcessBuilder pb = new ProcessBuilder(comando);
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