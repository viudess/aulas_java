package aula3.pendentes;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aceite;

        do {
            int n, resultado = 1;

            System.out.print("Digite o valor para calcular o fatorial: ");
            n = sc.nextInt();

            while (n < 0) {
                System.out.print("O valor deve ser positivo! Digite novamente: ");
                n = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int valorAtual = n - i;
                resultado *= valorAtual;

                System.out.print(valorAtual + (valorAtual > 1 ? " * " : ""));
            }

            System.out.printf("\nO resultado é: %d\n", resultado);

            do {
                System.out.print("\nDeseja uma nova execução? (S/N): ");
                aceite = sc.next().toUpperCase();

                if (!aceite.equals("S") && !aceite.equals("N")) {
                    System.out.println("Resposta inválida! Digite apenas S ou N.");
                }
            } while (!aceite.equals("S") && !aceite.equals("N"));

        } while (aceite.equals("S"));{
            System.out.println("Programa encerrado.");
            sc.close();
        }
    }
}
