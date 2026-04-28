package checkpoints;

import java.util.Scanner;

public class Cp01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num, qtd_pos=0, qtd_neg=0, num_maior=0, num_menor=0, soma=0;
        double media, perc_pos=0, perc_neg=0;

        System.out.print("Digite a qtd de valores que serão digitados: ");
        n = sc.nextInt();

        while(n < 1 || n > 19){
            System.out.println("Erro! Digite apenas números entre 1 e 19!");
            System.out.print("Digite a qtd de valores que serão digitados: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            System.out.printf("Digite o %d° número: ", i);
            num = sc.nextInt();

            if (num >= 0)
                qtd_pos++;
            else
                qtd_neg++;

            if (i == 1){
                num_maior = num;
                num_menor = num;
            }
            else if (num > num_maior)
                num_maior = num;
            else if (num < num_menor)
                num_menor = num;

            soma += num;
        }

        media = (double) soma / n;

        perc_pos = (double) (qtd_pos * 100) / n;
        perc_neg = (double) (qtd_neg * 100) / n;

        System.out.printf("O maior número é: %d\n", num_maior);
        System.out.printf("O menor número é: %d\n", num_menor);
        System.out.printf("A soma dos números foi: %d\n", soma);
        System.out.printf("A média dos números é: %.2f\n", media);
        System.out.printf("O percentual de números positivos é: %.1f%%\n", perc_pos);
        System.out.printf("O percentual de números negativos é: %.1f%%\n", perc_neg);

        sc.close();
    }
}
