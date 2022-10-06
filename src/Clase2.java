import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaIp = new ArrayList<Integer>();

        for (int i =0 ; i<10; i++){
            listaIp.add(sc.nextInt());
        }

        for (int i =0 ; i<10; i++){
            if (listaIp.get(i) <224 ){
                System.out.println(listaIp.get(i));
            }
        }
    }
}
