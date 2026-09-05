package src.questao12.entities;

public class Moto extends Veiculo{

    private int cilindradas;
    private String freiosABS;

    public Moto(String marca, String modelo, int quantidadeDeRodas, String cor, int cilindradas, String freiosABS) {
        super(marca, modelo, quantidadeDeRodas, cor);
        this.cilindradas = cilindradas;
        this.freiosABS = freiosABS;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getFreiosABS() {
        return freiosABS;
    }

    @Override
    public String toString() {
        return
                "\nMoto"
                + super.toString() +
                "\nCilindradas: " + cilindradas +
                "\nFreiosABS: " + freiosABS +
                "\n--------------------------------------";
    }

}
