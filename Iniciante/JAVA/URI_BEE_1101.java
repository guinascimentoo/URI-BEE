import java.util.Scanner;

public class URI_BEE_1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        while (((n1 = sc.nextInt()) > 0) && ((n2 = sc.nextInt()) > 0)){
            int somatoria = 0;
            if (n1 > n2){
                for(n2 = n2; n2 <= n1; n2++){
                    somatoria += n2;
                    System.out.print(n2 + " ");
                }
            } else {
                for(n1 = n1; n1 <= n2; n1++){
                    somatoria += n1;
                    System.out.print(n1 + " ");
                }
            }
            System.out.println("Sum=" + somatoria);
        }
    }
}