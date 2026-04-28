package aula1;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double p1, p2, p3, p4, p5, troco, pag, total_prod;

        System.out.printf("Digite o valor do primeiro produto: ");
        p1 = ler.nextDouble();

        System.out.printf("Digite o valor do segundo produto: ");
        p2 = ler.nextDouble();

        System.out.printf("Digite o valor do terceiro produto: ");
        p3 = ler.nextDouble();

        System.out.printf("Digite o valor do quarto produto: ");
        p4 = ler.nextDouble();

        System.out.printf("Digite o valor do quinto produto: ");
        p5 = ler.nextDouble();

        System.out.printf("Digite o valor do pagamento: ");
        pag = ler.nextDouble();

        total_prod = p1 + p2 + p3 + p4 + p5;
        troco = pag - total_prod;

        System.out.printf("O total dos produtos foi R$ %.2f e o pagamento foi R$ %.2f. Sendo assim o troco é R$ %.2f.", total_prod, pag, troco);

        ler.close();
    }
}
