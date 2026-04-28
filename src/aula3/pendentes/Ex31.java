package aula3.pendentes;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sub = 0;

        System.out.print("Digite o valor: ");
        n = sc.nextInt();

        System.out.println("Números subsequentes: ");
        for (int i = 1; i <= 20; i++) {
            sub = n - i;
            System.out.print(sub + (sub > sub - 1 && i != 20 ? ", " : ""));
        }

        sc.close();
    }
}
