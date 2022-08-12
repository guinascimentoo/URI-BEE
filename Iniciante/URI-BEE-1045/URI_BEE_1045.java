import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aux;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if(B > A){
            aux = A;
            A = B;
            B = aux;
        }

        if(C > A){
            aux = A;
            A = C;
            C = aux;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            else {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}