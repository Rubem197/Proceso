import java.io.File;

public class lanzarTicketCompra {

    public static void main(String[] args) {

        File fichero = new File("C:\\Users\\rlindes\\IdeaProjects\\Proceso\\src\\SalidaTicket.txt");

        ProcessBuilder pb = new ProcessBuilder(args);
        pb.command("java", "ticketCompra");
        pb.inheritIO();
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(fichero));
        try {
            Process p = pb.start();
        }catch (Exception e){

        }
    }
}
