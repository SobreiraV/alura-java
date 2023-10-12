import java.util.Random;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String jogar;

        do {
            int numeroAdivinhado = 0;
            int numeroAlvo = new Random().nextInt(100);
            System.out.println(numeroAlvo);

            for (int i = 0; i < 5; i++) {
                System.out.println("Tente adivinhar o número inteiro entre 0 e 100: ");
                numeroAdivinhado = leitura.nextInt();
                if (numeroAdivinhado < numeroAlvo) {
                    System.out.println("O número é maior!");
                } else if (numeroAdivinhado > numeroAlvo) {
                    System.out.println("O número é menor!");
                } else if (numeroAdivinhado == numeroAlvo) {
                    break;
                }
            }

            if (numeroAlvo == numeroAdivinhado) {
                System.out.println("Parabéns, você acertou! O número era " + numeroAlvo);
            } else {
                System.out.println("Que pena você não conseguiu adivinhar. O número era " + numeroAlvo);
            }

            System.out.println("Deseja jogar novamente? (s/n): ");
            jogar = leitura.next();
        } while (jogar.equalsIgnoreCase("s"));
    }
}
