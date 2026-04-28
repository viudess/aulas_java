package aula2;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite o seu peso em kg: ");
        peso = sc.nextDouble();

        System.out.print("Digite a sua altura em m: ");
        altura = sc.nextDouble();

        // imc = peso / (altura * altura);
        imc = peso / (Math.pow(altura, 2));

        System.out.printf("O seu IMC é: %.1f\n", imc);

        if (imc < 20)
            System.out.print("Abaixo do peso!");
        else if (imc < 25)
            System.out.print("Peso ideal!");
        else
            System.out.print("Acima do peso!");

        sc.close();
    }
}
