import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num[] = new double[6];
        double mediaPositivos = 0;
        int contador = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextDouble();
            if(num[i] > 0) {
                contador++;
                mediaPositivos += num[i];
            }
        }
        mediaPositivos = mediaPositivos / contador;

        System.out.println(contador +" valores positivos");
        System.out.println(String.format("%.1f", mediaPositivos));
    }
}