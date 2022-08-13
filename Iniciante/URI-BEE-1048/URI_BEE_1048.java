import java.util.Locale;
import java.util.Scanner;

public class URI_BEE_1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double novoSalario, reajuste;
        int porcentagem;
        double salarioAtual = sc.nextDouble();

        if(salarioAtual >= 0 && salarioAtual <= 400.0){
            novoSalario = (salarioAtual * 0.15) + salarioAtual;
            reajuste = novoSalario - salarioAtual;
            porcentagem = 15;
        }
        else if(salarioAtual >= 400.01 && salarioAtual <= 800.00){
            novoSalario = (salarioAtual * 0.12) + salarioAtual;
            reajuste = novoSalario - salarioAtual;
            porcentagem = 12;
        }
        else if(salarioAtual >= 800.01 && salarioAtual <= 1200.00){
            novoSalario = (salarioAtual * 0.10) + salarioAtual;
            reajuste = novoSalario - salarioAtual;
            porcentagem = 10;
        }
        else if(salarioAtual >= 1200.01 && salarioAtual <= 2000.00){
            novoSalario = (salarioAtual * 0.07) + salarioAtual;
            reajuste = novoSalario - salarioAtual;
            porcentagem = 7;
        }
        else{
            novoSalario = (salarioAtual * 0.04) + salarioAtual;
            reajuste = novoSalario - salarioAtual;
            porcentagem = 4;
        }
        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + porcentagem + " %");
    }
}