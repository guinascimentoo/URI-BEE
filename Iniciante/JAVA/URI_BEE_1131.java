import java.util.Scanner;

public class URI_BEE_1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contInter = 0, contGremio = 0, contEmpates = 0, totalGrenais = 0, escolha = 0;

        do{
            totalGrenais++;
            int pInter = sc.nextInt();
            int pGremio = sc.nextInt();

            if(pInter > pGremio){
                contInter++;
            }
            else if(pGremio > pInter){
                contGremio++;
            }
            else{
                contEmpates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            escolha = sc.nextInt();
        }while (escolha == 1);

        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + contInter);
        System.out.println("Gremio:" + contGremio);
        System.out.println("Empates:" + contEmpates);

        if(contInter > contGremio){
            System.out.println("Inter venceu mais");
        }
        else if(contGremio > contInter){
            System.out.println("Gremio venceu mais");
        }
        else{
            System.out.println("Nao houve vencedor");
        }
    }
}