package ArraysExercise;

import java.util.Scanner;

public class WhereWally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];
        int alvo, contador = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o " + (i+1) + "º número");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Digite o número a ser encontrado:");
        alvo = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (alvo == numbers[i]) {
                System.out.println("Número " + alvo + " encontrado na posição " + i);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Número alvo não encontrado");
        } else { 
            System.out.println("Número alvo encontrado " + contador + " vezes");
        }

        sc.close();
    }
}
