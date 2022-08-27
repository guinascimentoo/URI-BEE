import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num[] = new double[5];
        int contador = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextDouble();
            if(num[i] % 2 == 0)
                contador++;
            }
        System.out.println(contador + " valores pares");
    }
}