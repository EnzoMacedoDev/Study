import java.util.*;

public class LuckLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerarRandom = new Random();

        double saldoInicial = 0, saldoAtual = 0;
        int escolhaAposta, dado, valorAposta, deposito;

        System.out.println("------ SEJA BEM VINDO/A AO CASSINO LUCK&LOGIC -----");

        while (saldoAtual >= 0) {
            System.out.println("Qual valor deseja apostar?");
            valorAposta = sc.nextInt();

            if (saldoAtual <= 0 || saldoInicial <= 0) {
                System.out.printf("%.2f\n Seu saldo atual é de ", saldoAtual);
                System.out.println("Quanto deseja depositar para começar?");
                deposito = sc.nextInt();

                saldoInicial = deposito;
                saldoAtual = saldoInicial;
            }

            System.out.println("Qual valor deseja apostar?");
            valorAposta = sc.nextInt();

            saldoAtual = saldoAtual - valorAposta;

            System.out.println("Em qual número deseja apostar (1 a 6)");
            escolhaAposta = sc.nextInt();
            if (escolhaAposta < 1 || escolhaAposta > 6) {
                System.out.println("Número digitado incorreto, preste mais atenção e tente novamente!");

                System.out.println("Em qual número deseja apostar (1 a 6)");
                escolhaAposta = sc.nextInt();
            }

            System.out.println("Número sendo sorteado...");
            dado = gerarRandom.nextInt(6) + 1;
            System.out.println("O número sorteado foi: " + dado);

            if (dado == escolhaAposta) {
                System.out.println("Parabéns, você ganhou!");
                System.out.println("------ SALDO ATUAL ------");
                saldoAtual += valorAposta;
                System.out.println("------ " + saldoAtual + " ------");
            } else {
                System.out.println("Que pena, você perdeu!");
            }

            if (saldoAtual <= 0) {
                System.out.println("Que pena, você faliu. Estude mais e tente novamente.");
            }
        }

    }
}