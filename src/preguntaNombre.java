import java.util.Scanner;

public class preguntaNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        System.out.println("Hola "+ nombre);
    }
}
