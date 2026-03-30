import java.util.*;

public class Athlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String AthleteName, bestAthlete = "";
        int note, majorNote = 0, totalParticipantes = 0, sumNote= 0;
        double mediaTotal;

        System.out.println("Digite o nome do atleta: ");
        AthleteName = scanner.nextLine();

        while (!AthleteName.equalsIgnoreCase("fim")) {

            System.out.println("Digite a nota desse atleta (0 a 100)");
            note = scanner.nextInt();
            scanner.nextLine();

            sumNote = sumNote + note;

            if (note < 0 || note > 100) {
                System.out.println("nota inválida, tente novamente!");
                continue;
            }

            if (note > majorNote) {
                majorNote = note;
                bestAthlete = AthleteName;
            }

            System.out.println("Digite o nome do próximo atleta (ou 'fim'): ");
            AthleteName = scanner.nextLine();

            totalParticipantes++;

            
        }

        mediaTotal = sumNote / totalParticipantes;

        System.out.println("O/A Atleta com maior nota é: " + bestAthlete);
        System.out.println("A nota foi de: " + majorNote);
        System.out.println("----------");
        System.out.println("Quantidade total de participantes: " + totalParticipantes + " participantes");
        System.out.printf(" A média de todas as notas é: %.2f\n", mediaTotal);
        
        scanner.close();
    }
}