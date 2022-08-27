import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num[] = new double[5];

        int contadorPar = 0, contadorImpar = 0, contadorPositivo = 0, contadorNegativo = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextDouble();
            if(num[i] > 0) {
                contadorPositivo++;
            }
            else if(num[i] < 0){
                contadorNegativo++;
            }
            if(num[i] % 2 == 0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
        }
        System.out.println(contadorPar +" valor(es) par(es)");
        System.out.println(contadorImpar +" valor(es) impar(es)");
        System.out.println(contadorPositivo +" valor(es) positivo(s)");
        System.out.println(contadorNegativo +" valor(es) negativo(s)");
    }
}