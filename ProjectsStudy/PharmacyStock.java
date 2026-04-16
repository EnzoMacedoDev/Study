package ProjectsStudy;

import java.util.*;

public class PharmacyStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] stock = new int[5][6];
        int choice, shelf, compartment, shelfReal, compartmentReal, amount = 0, sumTotal;

        System.out.println("\n===============================");
        System.out.println("  WELLCOME THE PHARMACY STOCK  ");
        System.out.println("===============================\n");

        do {

            System.out.println("WHAT DO YOU WANT TO DO? \n");

            System.out.println("1 - ADD TO STOCK");
            System.out.println("2 - MAKE SALE");
            System.out.println("3 - CHECK COMPARTMENT");
            System.out.println("4 - GENERAL INVENTORY (SUM ALL ITEMS THE STOCK)");
            System.out.println("5 - EXIT");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Select the shelf (1 to 5)");
                        shelf = sc.nextInt();
                        System.out.println("Select the compartment (1 to 6)");
                        compartment = sc.nextInt();

                        if (shelf < 1 || shelf > 5 || compartment < 1 || compartment > 6) {
                            System.out.println("Error: Non-existent position");
                        } else {
                            shelfReal = shelf - 1;
                            compartmentReal = compartment - 1;

                            System.out.println("How many boxes do you want to add? ");
                            amount = sc.nextInt();
                            stock[shelfReal][compartmentReal] += amount;

                            System.out.println("\n===============================");
                            System.out.println("     Boxes added successfully.   ");
                            System.out.println("===============================\n");
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Select the shelf (1 to 5)");
                        shelf = sc.nextInt();
                        System.out.println("Select the compartment (1 to 6)");
                        compartment = sc.nextInt();

                        if (shelf < 1 || shelf > 5 || compartment < 1 || compartment > 6) {
                            System.out.println("Error: Non-existent position");
                        } else {
                            shelfReal = shelf - 1;
                            compartmentReal = compartment - 1;

                            System.out.println("How many products do you want to sell?");
                            amount = sc.nextInt();

                            if (amount > stock[shelfReal][compartmentReal]) {
                                System.out.println("The quantity of items in stock is insufficient.");
                            } else {
                                stock[shelfReal][compartmentReal] -= amount;

                                System.out.println("\n===============================");
                                System.out.println("     BOXES SOLD SUCCESSFULLY     ");
                                System.out.println("===============================\n");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("Select the shelf (1 to 5)");
                        shelf = sc.nextInt();
                        System.out.println("Select the compartment (1 to 6)");
                        compartment = sc.nextInt();

                        if (shelf < 1 || shelf > 5 || compartment < 1 || compartment > 6) {
                            System.out.println("Error: Non-existent position");
                        } else {
                            shelfReal = shelf - 1;
                            compartmentReal = compartment - 1;

                            System.out
                                    .println("Number of boxes on the shelf + " + (shelfReal+1) + " in the compartment: "
                                            + (compartmentReal+1) + " is: " + stock[shelfReal][compartmentReal]);

                            break;
                        }
                    }
                    break;

                case 4:
                    sumTotal = 0;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            sumTotal = sumTotal + stock[i][j];
                        }
                    }

                    System.out.println("The quantity of items in stock is: " + sumTotal);
                    break;

                case 5:
                    System.out.println("==================================");
                    System.out.println("     THANK YOU, COME BACK SOON    ");
                    System.out.println("==================================");
                    break;

                default:
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
