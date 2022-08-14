import java.util.Scanner;

public class URI_BEE_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = 0;

        if(num1 > num2){
            for(int i = num1 - 1; i > num2; i--){
                if(i % 2 !=0){
                    soma += i;
                }
            }
        }
        else {
            for(int i = num1; i < num2; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}