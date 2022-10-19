import java.io.*;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File fSalida= new File("C:\\Users\\rlindes\\IdeaProjects\\Proceso\\salidaProcesoLento.txt");
        Runtime r = Runtime.getRuntime();

        Process p = r.exec("java , ProcesoLento");
        InputStream is = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fSalida));

        String line = br.readLine();
        while ( line !=null) {
           bw.write(line);
           bw.newLine();
           line = br.readLine();
        }
        br.close();
        bw.close();
        is.close();
        isr.close();
    }
}
