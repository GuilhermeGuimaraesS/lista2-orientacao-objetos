package src.questao10.entities;

public class Celular {

    private String marca;
    private String modelo;
    private int armazenamento;

    public Celular(String marca) {
        this.marca = marca;
    }

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Celular(String marca, String modelo, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void exibirDados() {
        System.out.println("--------------------------------------");
        System.out.println("Dados do Celular" +
                "\nmarca: " + marca +
                "\nmodelo: " + modelo +
                "\narmazenamento: " + armazenamento + "GB"
        );
        System.out.println("--------------------------------------");
    }
}
