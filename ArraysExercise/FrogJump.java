package ArraysExercise;

import java.util.Scanner;

public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] even = new int[5];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numbers[i] = sc.nextInt();


            if (i % 2 == 0) {
                even[j] = numbers[i];
                j++;
            }
        }

        for (int i = 0; i < even.length; i++) {
            System.out.println(even[i]);
        }

        sc.close();
    }
}
