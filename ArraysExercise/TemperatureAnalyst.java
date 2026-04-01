package ArraysExercise;

import java.util.Scanner;

public class TemperatureAnalyst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperature = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a temperatura do dia " + (i+1));

            temperature[i] = sc.nextDouble();
        }

        double maior = temperature[0];
        double menor = temperature[0];
        double soma = 0;

        for (int i = 0; i < temperature.length; i++) {

            soma += temperature[i];

            if (temperature[i] > maior) {
                maior = temperature[i];
            } else if(temperature[i] < menor){
                menor = temperature[i];
            }
        }

        double media = soma / temperature.length;

        System.out.println("o maior: "+maior);
        System.out.println("o menor: "+menor);
        System.out.println("a media: "+media);

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > media) {
                System.out.println("Dia " + (i+1) + " tem uma temperatura maior que a média: " + temperature[i]);
            }
        }

        sc.close();
    }
}
