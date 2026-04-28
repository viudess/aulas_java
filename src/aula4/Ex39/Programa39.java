package aula4.Ex39;

import java.util.Scanner;

public class Programa39 {
    public static void main(String[] args) {
        Produto39[] produtos = new Produto39[10];
        Scanner sc = new Scanner(System.in);

        int opcao = 0, id = 0, id_produto, qtd;

        while(true){
            System.out.println("=== Menu - Sistema de Controle de Estoque de Loja ===");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Entrada de Estoque");
            System.out.println("3 - Saída de Estoque");
            System.out.println("4 - Relatório de Produto");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                sc.nextLine();

                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Preço unitário: ");
                double preco = sc.nextDouble();

                Produto39 p = new Produto39(id, nome, preco);

                produtos[id] = p;
                id++;

                System.out.println("Produto cadastrado com sucesso!");
            }
            else if (opcao == 2){
                System.out.println("Lista de Produtos:");
                for (int i=0; i<id; i++) {
                    produtos[i].exibirProduto();
                }

                System.out.print("Digite o id do produto para realizar a entrada de estoque: ");
                id_produto = sc.nextInt();

                System.out.print("Digite a quantidade de entrada no estoque: ");
                qtd = sc.nextInt();

                produtos[id_produto].adicionarEstoque(qtd);
            }
            else if (opcao == 3){
                System.out.println("Lista de Produtos:");
                for (int i=0; i<id; i++) {
                    produtos[i].exibirProduto();
                }

                System.out.print("Digite o id do produto para realizar a saída do estoque: ");
                id_produto = sc.nextInt();

                System.out.print("Digite a quantidade de saída no estoque: ");
                qtd = sc.nextInt();

                produtos[id_produto].removerEstoque(qtd);
            }
            else if (opcao == 4){
                System.out.println("Lista de Produtos:");
                for (int i=0; i<id; i++) {
                    produtos[i].exibirProduto();
                }
            }
            else{
                break;
            }
        }

        sc.close();
    }
}
