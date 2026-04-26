import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b, a, area;

        System.out.print("Digite a base do retângulo: ");
        b = sc.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        a = sc.nextInt();

        area = b * a;

        System.out.printf("A área do retângulo é: %d, pois é o produto da base %d e da altura %d", area, b, a);

        sc.close();
    }
}