import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeCobaias, somaCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
        char especieCobaia;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            quantidadeCobaias = sc.nextInt();
            especieCobaia = sc.next().charAt(0);
            switch (especieCobaia){
                case 'C': totalCoelhos += quantidadeCobaias;
                    break;
                case 'R': totalRatos += quantidadeCobaias;
                    break;
                case 'S': totalSapos += quantidadeCobaias;
                    break;
            }
            somaCobaias += quantidadeCobaias;
        }
        System.out.println("Total: " + somaCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", ((double) totalCoelhos / somaCobaias) * 100) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", ((double) totalRatos / somaCobaias) * 100) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ((double) totalSapos / somaCobaias) * 100) + " %");
    }
}