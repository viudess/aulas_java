package aula3;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, t;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while(num <= 0){
            System.out.println("Erro! Digite apenas números positivos!");
            System.out.print("Digite um número: ");
            num = sc.nextInt();
        }

        for(int i = 1; i <= 10; i++){
            t = num * i;
            System.out.printf("%d x %d = %d\n", num, i, t);
        }

        sc.close();
    }
}
