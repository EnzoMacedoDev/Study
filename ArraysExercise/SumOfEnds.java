package ArraysExercise;

import java.util.Scanner;

public class SumOfEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] numbers = new int[6];


        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i+1) + "º número");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            sum = numbers[i] + numbers[5-i];
            System.out.println(sum);
        }

        sc.close();

    }
}
