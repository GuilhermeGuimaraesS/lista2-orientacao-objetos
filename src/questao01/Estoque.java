package questao01;

import questao01.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("CADASTRO DE PRODUTOS");
        System.out.println("Quantos tipos de produtos serão cadastrados? ");
        int tiposDeProdutos = entrada.nextInt();

        for (int indice = 0; indice < tiposDeProdutos; indice++){
            System.out.println("PRODUTO #" + (indice + 1));
            System.out.println("Nome: ");
            entrada.nextLine();
            String nome = entrada.nextLine();
            System.out.println("Preço: ");
            double valor = entrada.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = entrada.nextInt();
            Produto novoProduto = new Produto(nome, valor, quantidade);
            produtos.add(novoProduto);
        }

        for(Produto produto : produtos){
            produto.mostrarProduto();
        }

    }
}
