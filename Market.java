import java.util.*;

public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoItem = -1, valorTotal = 0;
        int totalItens = 0;

        System.out.println("Bem vindo ao super mercado java!");

        while (precoItem != 0) {

            System.out.println("Digite o valor do item.");
            precoItem = scanner.nextDouble();

            if (precoItem > 0) {
                valorTotal += precoItem;
                totalItens++;
            }
        }

        System.out.println("\n======================================");
        System.out.println("          SUPER MERCADO ENZO");
        System.out.println("======================================");

        System.out.print("Gerando cupom...");
        for (int i = 0; i < totalItens; i++) {
            System.out.println("...............");
        }

        System.out.println("\n======================================");
        System.out.println("Total de Itens: " +totalItens);
        System.out.printf("Subtotal: R$ %.2f\n", valorTotal);

        double valorDesconto = 0;
        if (totalItens > 5) {
            valorDesconto = valorTotal * 0.90;
            valorTotal = valorDesconto;
            System.out.printf("Desconto: R$ %.2f", valorDesconto);
        } else {
            System.out.println("Sem desconto aplicado");
        }

        System.out.printf("Valor total a pagar: %.2f\n", valorTotal);

        System.out.println("======================================");
        System.out.println("      OBRIGADO PELA PREFERÊNCIA");
        System.out.println("======================================");
        
    }
}
