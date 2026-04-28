package aula4.Ex39;

public class Produto39 {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto39(){

    }

    public Produto39(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0; // Inicia vazio
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println("Entrada realizada com sucesso!");
        }
        else {
            System.out.println("Erro: A quantidade deve ser positiva.");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println("Saída realizada com sucesso!");
        }
        else{
            System.out.println("Erro: Saída de estoque inválida!");
        }
    }

    public void exibirProduto(){
        System.out.println("Código: " + this.codigo + " | Nome: " + this.nome + " | Preço: $" + this.preco + " | Quantidade: " + this.quantidade);
    }
}
