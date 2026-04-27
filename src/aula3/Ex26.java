import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, s=0, v;

        System.out.print("Digite a quantidade de elementos que a sequência terá: ");
        n = sc.nextInt();

        while (n < 1 || n > 99){
            System.out.println("Erro! Digite apenas números entre 1 e 99!");
            System.out.print("Digite a quantidade de elementos que a sequência terá: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            v = (i * i) + 1;
            System.out.println(v);
            s += v;
        }

        System.out.printf("A soma dos valores é: %d", s);

        sc.close();
    }
}
