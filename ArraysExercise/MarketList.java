package ArraysExercise;

import java.util.Scanner;

public class MarketList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = new String[4];
        Double[] price = new Double[4];
        double sum = 0;
        double moreExpansive = 0;
        String moreExpansiveProduct = "";

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the product name...");
            products[i] = sc.nextLine();
            System.out.println("Enter the price product...");
            price[i] = sc.nextDouble();

            sum += price[i];

            if (price[i] > moreExpansive) {
                moreExpansive = price[i];
                moreExpansiveProduct = products[i];
            }


            sc.nextLine();
        }

        for (int i = 0; i < products.length; i++) {
            System.out.println("Product: " + (i+1) + " " + products[i] + " ......... " + price[i]);
        }
        System.out.printf("Total value: %.2f\n", sum);
        System.out.println("More Expansive: " + moreExpansive + " " + moreExpansiveProduct);
        
        sc.close();
    }
}
