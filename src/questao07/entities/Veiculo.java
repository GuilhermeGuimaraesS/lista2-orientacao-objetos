package questao07.entities;

public class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
