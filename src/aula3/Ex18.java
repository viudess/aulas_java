package aula3;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while (num < 0) {
            System.out.println("Erro! Digite apenas números positivos!");
            System.out.print("Digite um número: ");
            num = sc.nextInt();
        }

        System.out.println("Fim do programa!");

        sc.close();
    }
}
