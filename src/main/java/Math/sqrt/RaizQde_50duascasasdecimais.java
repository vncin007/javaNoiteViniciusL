package Math.sqrt;

public class RaizQde_50duascasasdecimais {
    public static void main(String[] args) {

        double raizq = Math.sqrt(50);
        double raizArredondada = Math.round(raizq * 100.0) / 100.0;

        System.out.println(raizArredondada);
    }
}
