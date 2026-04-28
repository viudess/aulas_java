package aula3.pendentes;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aceite;

        do {
            int inicio, fim, soma = 0;

            System.out.print("Digite o valor inicial: ");
            inicio = sc.nextInt();
            System.out.print("Digite o valor final: ");
            fim = sc.nextInt();

            int menor = Math.min(inicio, fim);
            int maior = Math.max(inicio, fim);

            System.out.print("Sequência: ");

            for (int i = menor; i <= maior; i++) {
                soma += i;

                System.out.print(i + (i < maior ? " + " : ""));
            }

            System.out.printf("\nO valor total da soma é: %d\n", soma);

            do {
                System.out.print("\nDeseja uma nova execução? (S/N): ");
                aceite = sc.next().toUpperCase();

                if (!aceite.equals("S") && !aceite.equals("N")) {
                    System.out.println("Erro! Digite apenas S ou N.");
                }
            } while (!aceite.equals("S") && !aceite.equals("N"));

        } while (aceite.equals("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}