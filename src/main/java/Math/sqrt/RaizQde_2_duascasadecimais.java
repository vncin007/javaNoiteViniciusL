package Math.sqrt;

public class RaizQde_2_duascasadecimais {
    public static void main(String[] args) {

        double raizq = Math.sqrt(2);
        double raizArredondada = Math.round(raizq * 100.0) / 100.0;

        System.out.println(raizArredondada);
    }
}
