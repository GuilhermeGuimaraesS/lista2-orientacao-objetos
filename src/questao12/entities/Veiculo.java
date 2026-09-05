package src.questao12.entities;

public class Veiculo {

    private String marca;
    private String modelo;
    private int quantidadeDeRodas;
    private String cor;

    public Veiculo(String marca, String modelo, int quantidadeDeRodas, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }


    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nQuantidade de rodas: " + quantidadeDeRodas +
                "\nCor: " + cor;
    }
}
