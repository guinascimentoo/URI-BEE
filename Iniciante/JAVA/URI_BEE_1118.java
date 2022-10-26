import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class URI_BEE_1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nCalculo;
        double nota1;

        do {
            nota1 = sc.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }

            double nota2 = sc.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }

            if (nota1 > 0 && nota1 < 10 || nota2 > 0 && nota2 < 10) {
                double div = (nota1 + nota2) / 2;
                System.out.printf("media = %.2f%n", div);
            }

            System.out.println("novo calculo (1-sim 2-nao)");
            nCalculo = sc.nextInt();
            while (nCalculo != 1 && nCalculo != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                nCalculo = sc.nextInt();
            }
        }while(nCalculo == 1);
    }
}