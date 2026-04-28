package aula3;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        while (b <= a) {
            System.out.println("Erro! O segundo número deve ser maior do que o primeiro!");
            System.out.print("Digite o segundo número: ");
            b = sc.nextInt();
        }

        System.out.println("Fim do programa!");

        sc.close();
    }
}
