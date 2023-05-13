import Entidades.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("blusa", 55.5, 5);

        produto1.adicionarProduto(2);
        //System.out.println("Total de " + produto1.getNomeProduto() + " é "+ produto1.getQuantidadeProduto());
        produto1.removerProduto(3);
        //System.out.println("Total de " + produto1.getNomeProduto() + " no estoque é "+ produto1.getQuantidadeProduto());

        System.out.println(produto1);


    }
}