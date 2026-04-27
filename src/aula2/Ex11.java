import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int base, altura, area;

        System.out.print("Digite o valor da base: ");
        base = ler.nextInt();

        System.out.print("Digite o valor da altura: ");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("A área do retângulo é: %d m², pois a base é %d m e a altura foi %d m", area, base, altura);

        if (area > 100)
            System.out.print("\nTerreno Grande!");

        ler.close();
    }
}
