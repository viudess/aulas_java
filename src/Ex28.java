import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, maior=0, soma=0, media;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %d° número: ", i);
            num = sc.nextDouble();

            while(num <= 0){
                System.out.println("Erro! Digite apenas números positivos!");
                System.out.printf("Digite o %d° número: ", i);
                num = sc.nextDouble();
            }

            if (num > maior)
                maior = num;

            soma += num;
        }

        media = soma / 10;

        System.out.printf("O maior número é %.1f\n", maior);
        System.out.printf("A soma dos números é %.1f\n", soma);
        System.out.printf("A média aritmética dos números é %.1f\n", media);

        sc.close();
    }
}
