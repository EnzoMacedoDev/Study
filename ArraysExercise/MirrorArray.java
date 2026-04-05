package ArraysExercise;

import java.util.Scanner;

public class MirrorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um número inteiro");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Lista original");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Usa o int i = numbers.length - 1 pois apesar de ter 6 "gavetas" começamos a partir da posição 0
        System.out.println("Lista de trás para frente");
        for (int i = numbers.length -1 ; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //soma do primeiro com o ultimo indice
        int firstNumber = numbers[0];
        int lastNumber = numbers [numbers.length - 1];

        int sum = firstNumber + lastNumber;

        System.out.println("A soma do primeiro com o ultimo: " + sum);

        sc.close();
    }
}
