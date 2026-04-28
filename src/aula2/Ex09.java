package aula2;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        b = ler.nextInt();

        if (a < b)
            System.out.print("O primeiro valor é o menor!");
        else
            System.out.print("O segundo valor é o menor!");

        ler.close();
    }
}
