import java.util.Scanner;

public class URI_BEE_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao = 24 - (24 + horaInicial - horaFinal) % 24;

        System.out.println((horaInicial == horaFinal) ? "O JOGO DUROU 24 HORA(S)" : "O JOGO DUROU " + duracao + " HORA(S)");
    }
}