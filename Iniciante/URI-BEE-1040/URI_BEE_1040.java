import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println("Media: " + df.format(media));

        if(media <= 4.9 || media >= 7.0) {
            System.out.println((media >= 7.0) ? "Aluno aprovado." : "Aluno reprovado.");
        }

        if(media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.println("Nota do exame: " + df.format(notaExame));
            media = (notaExame + media) / 2;

            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(media));
        }
    }
}