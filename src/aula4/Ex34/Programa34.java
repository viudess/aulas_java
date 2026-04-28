package aula4.Ex34;

import java.util.Scanner;

public class Programa34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente34[] listaClientes = new Cliente34[5];

        int i = 0;

        while (i < 5){
            Cliente34 c = new Cliente34();

            System.out.print("Digite o id: ");
            c.id = sc.nextInt();

            System.out.print("Digite o nome: ");
            c.nome = sc.next();

            System.out.print("Digite a idade: ");
            c.idade = sc.nextInt();

            System.out.print("Digite o email: ");
            c.email = sc.next();

            listaClientes[i] = c;

            i = i + 1;
        }

        System.out.println("Lista de Clientes maior de idade: ");

        i = 0;

        while (i < 5){
            if (listaClientes[i].idade > 18)
                System.out.println("Id: " + listaClientes[i].id + " -  Nome: " + listaClientes[i].nome + " - Idade: " + listaClientes[i].idade + " - Email: " + listaClientes[i].email);
            i = i + 1;
        }

        sc.close();
    }
}
