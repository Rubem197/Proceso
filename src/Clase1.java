public class Clase1 {
    public static void main(String[] args) {
        int ip;
        int ip2;
        int ip3;
        int ip4;
        for (int i =0; i<10; i++){
            ip=(int) (Math.random()*255);
            ip2=(int) (Math.random()*255);
            ip3=(int) (Math.random()*255);
            ip4=(int) (Math.random()*255);
            System.out.println(ip + "." + ip2+ "." + ip3+ "."+ ip4);
        }

    }
}
