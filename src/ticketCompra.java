import java.util.Scanner;

public class ticketCompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //  System.out.println("Introduce el codigo");
        int codProducto = sc.nextInt();
    //  System.out.println("Introduce la cantidad");
        double precproducto = sc.nextDouble();
    //  System.out.println("Introduce la cantidad");
        int cantidad = sc.nextInt();
        int total = (int) (precproducto+cantidad);

        sc.close();

        System.out.println(codProducto+ "-"+ precproducto+"-"+ cantidad+"-"+ total);


    }
}
