package ArraysExercise;

import java.util.Scanner;

public class NumberLocator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("digite o numero para busca");
        int escolha = sc.nextInt();

        boolean achei = false;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == escolha) {
                System.out.println("Encontrado na posição: " + i);
                achei = true;
            }
        }

        if (!achei) {
            System.out.println("Numero não encontrado na lista");
        }

        sc.close();
    }
}