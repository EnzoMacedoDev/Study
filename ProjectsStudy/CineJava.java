package ProjectsStudy;

import java.util.Scanner;

public class CineJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] cinema = new int[3][4];
        int escolha = 0;
        int fileira, poltrona, qtdIngressos = 0;
        double valorIngresso = 25.00, faturamento = 0;

        System.out.println("==================================");
        System.out.println("    SEJA BEM VINDO AO CINE JAVA   ");
        System.out.println("==================================");

        do {

            System.out.println();
            System.out.println("     O QUE DESEJA FAZER HOJE?");
            System.out.println();
            System.out.println("1 - VER MAPA DA SALA");
            System.out.println("2 - RESERVAR ASSENTO");
            System.out.println("3 - VER FATURAMENTO");
            System.out.println("4 - SAIR");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("FILA " + (i + 1) + ": " + " ");
                        for (int j = 0; j < 4; j++) {
                            if (cinema[i][j] == 0) {
                                System.out.print("[L] " + " ");
                            } else {
                                System.out.print("[X] " + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Selecione a fileira: (1 a 3)");
                    fileira = sc.nextInt();

                    System.out.println("Selecione a poltrona: (1 a 4)");
                    poltrona = sc.nextInt();

                    if (fileira < 1 || fileira > 3 || poltrona < 1 || poltrona > 4) {
                        System.out.println("Erro: Posição inexistente");
                    } else {
                        int fileiraReal = fileira - 1;
                        int poltronaReal = poltrona - 1;

                        if (cinema[fileiraReal][poltronaReal] == 1) {
                            System.out.println("Assento ocupado!");
                        } else {
                            cinema[fileiraReal][poltronaReal] = 1;
                            System.out.println("Parabéns, Assento reservado!");
                            qtdIngressos++;
                        }
                    }
                    break;

                case 3:
                    faturamento = qtdIngressos * valorIngresso;

                    System.out.println("==================================");
                    System.out.println("            FATURAMENTO           ");
                    System.out.println("==================================");

                    System.out.println("Quantidade de ingresos vendidos: " + qtdIngressos);
                    System.out.println("Valor arrecadado: R$ " + faturamento);
                    System.out.print("==================================");
                    break;

                case 4:
                    System.out.println("==================================");
                    System.out.println("      OBRIGADO, VOLTE SEMPRE      ");
                    System.out.println("==================================");
                    break;

                default:
                    break;
            }
        } while (escolha != 4);
        sc.close();
    }
}
