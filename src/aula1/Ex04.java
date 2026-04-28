package aula1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, m;

        System.out.print("Digite o valor do primeiro número: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor do segundo número: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor do terceiro número: ");
        c = sc.nextDouble();

        System.out.print("Digite o valor do quarto número: ");
        d = sc.nextDouble();

        m = (a + b + c + d) / 4;

        System.out.printf("A média aritmética dos valores é: %.1f", m);

        sc.close();
    }
}
