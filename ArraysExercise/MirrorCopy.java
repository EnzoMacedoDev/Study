package ArraysExercise;

import java.util.Scanner;

public class MirrorCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                secondArray[i] = numbers[i];
            } else {
                secondArray[i] = 0;
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }

    sc.close();

    }
}
