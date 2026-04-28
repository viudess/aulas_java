package aula2;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        b = ler.nextInt();

        if (a > b)
            System.out.print("O primeiro valor é o maior!");
        else
            System.out.print("O segundo valor é o maior!");

        ler.close();
    }
}
