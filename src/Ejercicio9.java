import java.io.*;

public class Ejercicio9 {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        String[] comando = {"java", "preguntaNombre"};

        try {
            /**
             * Aqui iniciamos el proceso con el comando de ejecucion del programa
             * Inicializamos el filereader del fichero entrada y lo metemos en el BufferedReader.
             */
            Process p = r.exec(comando);
            FileReader fr = new FileReader("Entrada.txt");
            BufferedReader br = new BufferedReader(fr);
            /**
             * Aqui recogemos la entrada del programa y le decimos entre en un BufferedWriter para tener la
             * entrada recogida del fichero
             */
            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String line = br.readLine();
            while ( line !=null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            br.close();
            bw.close();
            os.close();
            osw.close();

            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);

            String linea = br2.readLine();
            while ( linea !=null) {
                System.out.println(linea);
                linea = br2.readLine();
            }
            is.close();
            isr.close();
            br2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
