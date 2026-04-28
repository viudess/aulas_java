package aula3;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int t;

        for(int num=1; num<=20; num++) {
            for (int i=1; i<=10; i++) {
                t = num * i;
                System.out.printf("%d X %d = %d\n", num, i, t);
            }
            System.out.printf("Pressione uma tecla para continuar...");
            ler.nextLine();
        }

        ler.close();
    }
}
