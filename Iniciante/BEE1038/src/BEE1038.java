import java.util.Locale;
import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codItem = sc.nextInt();
        int quantItem = sc.nextInt();

        if(codItem == 1){
            System.out.printf("Total: R$ %.2f%n", quantItem * 4.00);
        }
        else if(codItem == 2){
            System.out.printf("Total: R$ %.2f%n", quantItem * 4.50);
        }
        else if(codItem == 3){
            System.out.printf("Total: R$ %.2f%n", quantItem * 5.00);
        }
        else if(codItem == 4){
            System.out.printf("Total: R$ %.2f%n", quantItem * 2.00);
        }
        else{
            System.out.printf("Total: R$ %.2f%n", quantItem * 1.50);
        }
    }
}