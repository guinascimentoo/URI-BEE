import java.util.Scanner;

public class URI_BEE_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contAlcool = 0, contGasolina = 0, contDiesel = 0, codCombustivel;

        do {
            codCombustivel = sc.nextInt();
            if(codCombustivel == 4) {
                break;
            }
            while (codCombustivel < 1 && codCombustivel > 3){
               codCombustivel = sc.nextInt();
            }

            if (codCombustivel == 1) {
                contAlcool++;
            } else if (codCombustivel == 2) {
                contGasolina++;
            } else if (codCombustivel == 3){
                contDiesel++;
            }
        }while(codCombustivel != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);
    }
}