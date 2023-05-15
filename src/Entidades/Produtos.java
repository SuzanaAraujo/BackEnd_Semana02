package Entidades;

public class Produtos {
    private  String nomeProduto;
    private  double precoProduto;
    private int quantidadeProduto;
    private double valorTotal;
    private static int totalDeProdutos;
    public static void setTotalDeProdutos(int totalDeProdutos) {
        Produtos.totalDeProdutos = totalDeProdutos;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
}

    public int getQuantidadeProduto(){
        return this.quantidadeProduto;
    }

    public double getValorTotal(){
       return this.valorTotal;
    }

    public void setNomeProduto(String nomeProduto){
       this.nomeProduto = nomeProduto;
    }
    public void setPrecoProduto(double precoProduto){
       this.precoProduto = precoProduto;
    }

    public void adicionarProduto (int numero){
       this.quantidadeProduto += numero;
       this.valorTotal = quantidadeProduto * this.precoProduto;
}
    public void removerProduto (int numero){
       if (this.quantidadeProduto >= numero){
       this.quantidadeProduto -= numero;
       this.valorTotal = quantidadeProduto * this.precoProduto;
       } else {
           System.out.println("Não foi possivel remover essa quantidade de produto, rever estoque!");
       }
}
    public static int getTotalDeProdutos() {
    return Produtos.totalDeProdutos;
}
    @Override
    public String toString(){
        return this.nomeProduto + ", por R$ " +
                this.precoProduto + " cada, " +
                this.quantidadeProduto + " unidade(s) em estoque. Total de: R$ " +
                this.valorTotal;
    }
}
