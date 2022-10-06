public class Clase1 {
    public static void main(String[] args) {
        double ip;
        for (int i =0; i<10; i++){
            ip= Math.random()*255;
            System.out.println(String.format("%.0f", ip));
        }

    }
}
