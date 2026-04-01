package ArraysExercise;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] guest = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do condidado " + (i+1));
            guest[i] = sc.nextLine();
        }

        for (int i = 0; i < guest.length; i++) {
            System.out.println("posição " + i + " : " + guest[i]);
        }

        sc.close();
    }
}
