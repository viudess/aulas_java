package aula2;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1, p2;

        System.out.print("Digite a sua nota P1: ");
        p1 = sc.nextDouble();

        p2 = (15 - p1) / 2;

        System.out.printf("Você precisa tirar no mínimo %.1f na P2!\n", p2);

        sc.close();
    }
}
