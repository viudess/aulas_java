package aula1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b, a, area;

        System.out.print("Digite a base do triângulo: ");
        b = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        a = sc.nextDouble();

        area = (b * a) / 2;

        System.out.printf("A área do triângulo é: %.1f", area);

        sc.close();
    }
}
