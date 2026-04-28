package aula4.Ex35;

import java.util.Scanner;

public class Programa35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto35[] produtos = new Produto35[10];

        for (int i = 0; i < 3; i++) {
            Produto35 produto = new Produto35();

            produto.id = i+1;

            System.out.print("\n\nDigite o descrição do produto: ");
            produto.descricao = sc.next();

            System.out.print("Digite o valor do produto: ");
            produto.valor = sc.nextDouble();

            System.out.print("Digite a quantidade do produto: ");
            produto.quantidade = sc.nextDouble();

            produtos[i] = produto;
        }

        for (int i = 0; i < 3; i++){
            if (produtos[i].valor < 100 && produtos[i].quantidade > 10) {
                System.out.println("Descrição: " + produtos[i].descricao);
                System.out.println("Valor: " + produtos[i].valor);
                System.out.println("Quantidade: " + produtos[i].quantidade + "\n\n");
            }
        }

        sc.close();
    }
}
