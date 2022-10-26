import java.util.Scanner;

public class URI_BEE_1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, div;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            div = n1 / n2;

            if(n2 == 0){
                System.out.println("divisao impossivel");
            }
            else{
                System.out.println(div);
            }
        }
    }
}