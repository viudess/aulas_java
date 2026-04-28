package aula4.Ex38;

public class Cliente38 {
    private String agencia;
    private String conta;
    private double saldo;
    private String nome;
    private double limite;
    private String historico;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistorico() {
        return historico;
    }

    public Cliente38(){
        this.saldo = 0;
        this.limite = 50;
        this.historico = "";
    }


    public Cliente38(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.saldo = 0;
        this.limite = 50;
        this.historico = "";
    }


    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
        this.historico += "+ $" + valorDeposito + "\n";
    }


    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
        this.historico += "- $" + valorSaque + "\n";
    }


    public void transferir(Cliente38 clienteDestino, double valorTransferencia){
        this.sacar(valorTransferencia);
        clienteDestino.depositar(valorTransferencia);
    }

}
