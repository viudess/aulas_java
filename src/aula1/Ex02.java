import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado, area;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = sc.nextInt();

        area = lado * lado;

        System.out.printf("A área do quadrado é: %d", area);

        sc.close();
    }
}
