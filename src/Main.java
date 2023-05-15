import Entidades.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produtos> listaProdutos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String nome = "";

        while (!nome.equalsIgnoreCase("fim")){
            System.out.println("Você deseja cadastrar um novo produto? " +
                    "Se desejar finalizar a operação, digite fim");
            nome = entrada.next();
            Produtos produtoX = new Produtos();

            if (!nome.equalsIgnoreCase("fim")){

                System.out.println("Digite o nome do produto");
                produtoX.setNomeProduto(entrada.next());
                System.out.println("Digite o valor unitário deste produto");
                produtoX.setPrecoProduto(entrada.nextDouble());
                System.out.println("Digite a quantidade deste produto");
                produtoX.adicionarProduto(entrada.nextInt());

                listaProdutos.add(produtoX);
                Produtos.setTotalDeProdutos(listaProdutos.size());
              }
        }

        System.out.println("O estoque contém " + Produtos.getTotalDeProdutos() + " tipos de produtos diferentes");
        System.out.println(listaProdutos);

    }
}