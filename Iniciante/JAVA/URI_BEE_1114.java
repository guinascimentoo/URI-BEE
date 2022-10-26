import java.util.Scanner;

public class URI_BEE_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while(senha != 2002){
            senha = sc.nextInt();
            if(senha != 2002){
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");
            }
        }
    }
}