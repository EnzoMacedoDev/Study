import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double balance = 500.00, withdraw, deposit;
        int option = 0;

        do {

            System.out.println("============================");
            System.out.println("  WELLCOME THE SIMPLE BANK");
            System.out.println("============================");

            System.out.println("============================");
            System.out.println("=     SELECT THE OPTION    =");
            System.out.println("=          YOU WANT        =");
            System.out.println("============================");

            System.out.println("============================");
            System.out.println("=    1) SHOW BALANCE       =");
            System.out.println("=    2) WITHDRAW           =");
            System.out.println("=    3) DEPOSIT            =");
            System.out.println("=    4) EXIT               =");
            System.out.println("============================");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("============================");
                    System.out.println("        YOUR BALANCE      ");
                    System.out.println("      " + balance + "          ");
                    System.out.println("============================");
                    break;

                case 2:
                    System.out.println("============================");
                    System.out.println("Enter the withdrawal amount");
                    System.out.println("============================");

                    withdraw = scanner.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Invalid Option, try again.");
                    } else if (withdraw <= 0 ){
                        System.out.println("Amount invalid, try again");
                    } else {
                        System.out.println("Successful withdrawal");
                        balance -= withdraw;
                    }
                    break;

                case 3:
                    System.out.println("============================");
                    System.out.println("  Enter the deposit amount  ");
                    System.out.println("============================");

                    deposit = scanner.nextDouble();

                    if (deposit <= 0 ){
                        System.out.println("Deposit invalid, try again");
                    } else {
                        System.out.println("Successful withdrawal");
                        balance += deposit;
                    }
                    break;
                    
                case 4:
                    System.out.println("Closing down system...");
                    break;

                default:
                    System.out.println("Invalid option, please try again. Select an option from 1 to 4.");
                    break;
            }

        } while (option != 4);

        scanner.close();
    }
}
