package ArraysExercise;

import java.util.Scanner;

public class ValueInverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArray = new int[5];
        int[] invertArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + i + "º número" );
            firstArray[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = invertArray.length -1; i >= 0; i--) {
            invertArray[i] = firstArray[j];
            j++;
            System.out.print(invertArray[i] + " ");
        }

        sc.close();
    }   
}
