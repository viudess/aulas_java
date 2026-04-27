import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double imc, altura, peso;
        String sexo;

        System.out.print("Digite o seu peso (kg): ");
        peso = ler.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        altura = ler.nextDouble();

        System.out.print("Digite o sexo (m/f): ");
        sexo = ler.next();

        imc = peso / (altura * altura);

        System.out.print("Classificação:\n");

        if ( sexo.equals("m") ) {
            if (imc < 20)
                System.out.print("Abaixo do peso");
            else if (imc < 25)
                System.out.print("Peso ideal");
            else
                System.out.print("Acima do peso");
        }
        else if ( sexo.equals("f") ) {
            if (imc < 19)
                System.out.print("Abaixo do peso");
            else if (imc < 24)
                System.out.print("Peso ideal");
            else
                System.out.print("Acima do peso");
        }
        else
            System.out.print("Sexo inválido!");

        ler.close();
    }
}
