package src.questao12.entities;

public class Van extends Veiculo{

    private int quantidadeDePortas;
    private int quantidadeDeAcentos;
    private String tipoDeUso;

    public Van(String marca, String modelo, int quantidadeDeRodas, String cor, int quantidadeDePortas, int quantidadeDeAcentos, String tipoDeUso) {
        super(marca, modelo, quantidadeDeRodas, cor);
        this.quantidadeDePortas = quantidadeDePortas;
        this.quantidadeDeAcentos = quantidadeDeAcentos;
        this.tipoDeUso = tipoDeUso;
    }

    public Van(String marca, String modelo, int quantidadeDeRodas, String cor, int quantidadeDePortas,  String tipoDeUso) {
        super(marca, modelo, quantidadeDeRodas, cor);
        this.quantidadeDePortas = quantidadeDePortas;
        this.quantidadeDeAcentos = 3;
        this.tipoDeUso = tipoDeUso;
    }


    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public int getQuantidadeDeAcentos() {
        return quantidadeDeAcentos;
    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    private void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    @Override
    public String toString() {
        return
                "\nVan"
                + super.toString() +
                "\nQuantidadeDePortas: " + quantidadeDePortas +
                "\nQuantidadeDeAcentos: " + quantidadeDeAcentos +
                "\n--------------------------------------";
    }
}
