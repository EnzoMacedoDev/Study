package MatrizExercise;

import java.util.Scanner;

public class SumMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int sumTotal = 0, sumLinha0 = 0, sumLinha2 = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o " + (j + 1) + "º número da " + (i + 1) + "ª coluna");
                matriz[i][j] = sc.nextInt();

                sumTotal += matriz[i][j];
            }
        } 

        sumLinha0 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        sumLinha2 = matriz[0][2] + matriz[1][2] + matriz[2][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }  

        System.out.println("Soma total: " + sumTotal);
        System.out.println("Soma linha 0: " + sumLinha0);
        System.out.println("Soma linha 2: " + sumLinha2);

        sc.close();
    }
}
