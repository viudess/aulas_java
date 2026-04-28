package aula3.pendentes;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aceite;

        do {
            int a, b;

            System.out.print("Digite o valor de A: ");
            a = sc.nextInt();
            System.out.print("Digite o valor de B: ");
            b = sc.nextInt();

            int inicio = Math.min(a, b);
            int fim = Math.max(a, b);

            System.out.printf("\nNúmeros pares > 10 no intervalo [%d, %d]:\n", inicio, fim);

            boolean encontrouNenhum = true;

            for (int i = inicio; i <= fim; i++) {
                if (i > 10 && i % 2 == 0) {
                    System.out.print(i + " ");
                    encontrouNenhum = false;
                }
            }

            if (encontrouNenhum) {
                System.out.print("Nenhum número satisfaz as condições.");
            }

            System.out.println("\n");

            do {
                System.out.print("Deseja uma nova execução? (S/N): ");
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