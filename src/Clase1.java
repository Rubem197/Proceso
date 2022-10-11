public class Clase1 {
    public static void main(String[] args) {
        double ip;
        double ip2;
        double ip3;
        double ip4;
        String ipCompleta;
        for (int i =0; i<10; i++){
            ip= Math.random()*255;
            ip2= Math.random()*255;
            ip3= Math.random()*255;
            ip4= Math.random()*255;
            ipCompleta = String.format("%.0f", ip) +"."+ String.format("%.0f", ip2) + "."+ String.format("%.0f", ip3) +"."+ String.format("%.0f", ip4);
            System.out.println(ipCompleta);
        }

    }
}
