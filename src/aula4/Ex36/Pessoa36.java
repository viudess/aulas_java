package aula4.Ex36;

public class Pessoa36 {
    public int id;
    public String nome;
    public double saldo;

    public Pessoa36() {

    }

    public Pessoa36(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String nomePessoa(){
        return this.id + " - " + this.nome;
    }
}
