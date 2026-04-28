package aula4.Ex38;

import java.util.Scanner;

public class Programa38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente38[] clientes = new Cliente38[20];
        int opcao, id=0, id_cliente, id_cliente_dest;
        String nome, agencia, conta;
        double valor;

        while(true){
            System.out.println("=== Menu Java Banking ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Emitir Saldo");
            System.out.println("5 - Transferir");
            System.out.println("6 - Extrato");
            System.out.println("7 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Digite o nome do cliente: ");
                nome = sc.next();

                System.out.print("Digite a agência do cliente: ");
                agencia = sc.next();

                System.out.print("Digite a conta do cliente: ");
                conta = sc.next();

                Cliente38 c = new Cliente38(agencia, conta, nome);

                clientes[id] = c;
                id++;

                System.out.println("Cliente cadastrado com sucesso!");
            }
            else if (opcao == 2){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo() + " | Limite: " + clientes[i].getLimite());
                }

                System.out.print("Digite o id do cliente para realizar o depósito: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do depósito: ");
                valor = sc.nextDouble();

                clientes[id_cliente].depositar(valor);

                System.out.println("Depósito para " + clientes[id_cliente].getNome() + " realizado com sucesso!");
            }
            else if (opcao == 3){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo() + " | Limite: " + clientes[i].getLimite());
                }

                System.out.print("Digite o id do cliente para realizar o saque: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();

                if ( valor <= (clientes[id_cliente].getSaldo() + clientes[id_cliente].getLimite()) ) {
                    clientes[id_cliente].sacar(valor);
                    System.out.println("Saque para " + clientes[id_cliente].getNome() + " realizado com sucesso!");
                }
                else
                    System.out.println("Saldo ($" + clientes[id_cliente].getSaldo() + ") e Limite ($" + clientes[id_cliente].getLimite() + ") insuficiente para saque ($" + valor + ")!");
            }
            else if (opcao == 4){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo() + " | Limite: " + clientes[i].getLimite());
                }
            }
            else if (opcao == 5){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo() + " | Limite: " + clientes[i].getLimite());
                }

                System.out.print("Digite o id do cliente origem para realizar a transferência: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o id do cliente destino para realizar a transferência: ");
                id_cliente_dest = sc.nextInt();

                System.out.print("Digite o valor da transferência: ");
                valor = sc.nextDouble();

                clientes[id_cliente].transferir(clientes[id_cliente_dest], valor);

                System.out.println("Transferência no valor $" + valor + " de " + clientes[id_cliente].getNome() + " para " + clientes[id_cliente_dest].getNome() + " realizada com sucesso!");
            }
            else if (opcao == 6){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo() + " | Limite: " + clientes[i].getLimite());
                }

                System.out.print("Digite o id do cliente que você deseja obter o extrato: ");
                id_cliente = sc.nextInt();

                System.out.print(clientes[id_cliente].getHistorico());
                System.out.println("Saldo atual: $" + clientes[id_cliente].getSaldo());
            }
            else{
                break;
            }
        }

        sc.close();
    }
}
