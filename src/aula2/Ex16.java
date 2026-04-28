package aula2;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media, p1, p2;

        System.out.print("Digite a sua nota P1: ");
        p1 = sc.nextDouble();

        System.out.print("Digite a sua nota P2: ");
        p2 = sc.nextDouble();

        media = (p1 + (p2 * 2)) / 3;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 5)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        sc.close();
    }
}
