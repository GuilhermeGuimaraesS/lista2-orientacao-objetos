package questao01.entities;

import java.util.UUID;
import java.text.DecimalFormat;

public class Produto {

    private UUID id;
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id.toString();
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void mostrarProduto(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("==============================================================");
        System.out.println("ID: " + getId() +
                        "\nNome: " + getNome() +
                        "\nValor: R$" + df.format(getValor()) +
                        "\nQuantidade: " + getQuantidade()
        );
        System.out.println("==============================================================");
    }

}

