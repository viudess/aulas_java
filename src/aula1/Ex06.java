package aula1;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double cotacao, dolar, real;

        System.out.printf("Digite a cotação atual do dólar: ");
        cotacao = ler.nextDouble();

        System.out.printf("Digite a valor que representa a quantidade de dólares US$: ");
        dolar = ler.nextDouble();

        real = cotacao * dolar;

        System.out.printf("Baseado na cotação R$ %.2f, a quantia US$ %.2f é equivalente a R$ %.2f", cotacao, dolar, real);

        ler.close();
    }
}
