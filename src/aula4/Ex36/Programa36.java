package aula4.Ex36;

public class Programa36 {
    public static void main(String[] args) {
        Pessoa36 p1 = new Pessoa36();
        p1.id = 1;
        p1.nome = "Joao";
        p1.saldo = 0;

        Pessoa36 p2 = new Pessoa36(2, "Victor");

        p1.depositar(30);
        p2.depositar(50);
        p1.depositar(5);

        System.out.println(p1.nomePessoa());
        System.out.println(p2.nomePessoa());
    }

}
