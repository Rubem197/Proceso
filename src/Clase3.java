import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip = 0;
        List<String> listaIp = new ArrayList<String>();

        do {
            listaIp.add(sc.nextLine());
            ip++;
        } while (ip <10);

        for (int i = 0; i < listaIp.size(); i++) {
            if (Integer.parseInt(listaIp.get(i).substring(0,2))  >= 0 && Integer.parseInt(listaIp.get(i).substring(0,2))  <= 127) {

                System.out.println("La ip " + listaIp.get(i) + " es de clase a");

            } else if (Integer.parseInt(listaIp.get(i).substring(0,2))  >= 128 && Integer.parseInt(listaIp.get(i).substring(0,2))  <= 191) {

                System.out.println("La ip " + listaIp.get(i) + " es de clase b");

            } else if (Integer.parseInt(listaIp.get(i).substring(0,2))  >= 192 && Integer.parseInt(listaIp.get(i).substring(0,2))  <= 223) {

                System.out.println("La ip " + listaIp.get(i) + " es de clase c");

            }
        }
    }
}
