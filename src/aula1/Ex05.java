import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.print("Digite a temperatura em °C: ");
        c = sc.nextDouble();

        f = (c * 1.8) + 32;

        System.out.printf("A temperatura %.1f°C é equivalente a %.1f°F", c, f);

        sc.close();
    }
}
