package aula4.Ex37;

public class Cliente37 {
    public String agencia;
    public String conta;
    public double saldo;
    public String nome;

    public Cliente37(){

    }

    public Cliente37(String agencia, String conta, double saldo, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public double emitirSaldo(){
        return this.saldo;
    }
}
