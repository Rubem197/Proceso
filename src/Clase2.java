import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaIp = new ArrayList<String>();

        for (int i =0 ; i<10; i++){
            listaIp.add(sc.nextLine());
        }
        for (int i =0 ; i<10; i++){
            if (Integer.parseInt(listaIp.get(i).substring(0,1)) <224){
                System.out.println(listaIp.get(i));
            }
        }
    }
}
