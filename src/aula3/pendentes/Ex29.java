package aula3.pendentes;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aceite;

        do {
            int n_qtd, num, qtd_pos = 0, qtd_neg = 0, num_maior = 0, num_menor = 0, soma = 0;
            double media, perc_pos = 0, perc_neg = 0;

            System.out.print("Digite a quantidade de valores: ");
            n_qtd = sc.nextInt();

            while (n_qtd < 1 || n_qtd > 19) {
                System.out.println("Erro! Digite apenas números entre 1 e 19!");
                System.out.print("Digite novamente: ");
                n_qtd = sc.nextInt();
            }

            for (int i = 1; i <= n_qtd; i++) {
                System.out.printf("Digite o %dº número: ", i);
                num = sc.nextInt();

                if (num >= 0) qtd_pos++;
                else qtd_neg++;

                if (i == 1) {
                    num_maior = num;
                    num_menor = num;
                } else {
                    if (num > num_maior) num_maior = num;
                    if (num < num_menor) num_menor = num;
                }
                soma += num;
            }

            media = (double) soma / n_qtd;
            perc_pos = (double) (qtd_pos * 100) / n_qtd;
            perc_neg = (double) (qtd_neg * 100) / n_qtd;

            System.out.printf("\nMaior: %d | Menor: %d | Soma: %d\n", num_maior, num_menor, soma);
            System.out.printf("Média: %.2f | Positivos: %.1f%% | Negativos: %.1f%%\n", media, perc_pos, perc_neg);

            do {
                System.out.print("\nDeseja uma nova execução? (S/N): ");
                aceite = sc.next().toUpperCase();

                if (!aceite.equals("S") && !aceite.equals("N")) {
                    System.out.println("Resposta inválida! Digite apenas S ou N.");
                }
            } while (!aceite.equals("S") && !aceite.equals("N"));

        } while (aceite.equals("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}