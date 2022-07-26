import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ((A + B) > C && (A + C) > B && (B + C) > A){
            System.out.printf("Perimetro = %.1f%n", (A + B + C));
        }
        else{
            System.out.printf("Area = %.1f%n", ((A + B) * C) / 2);
        }
    }
}