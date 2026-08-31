package questao07.entities;

public class Carro extends Veiculo {

    private int quantidadeDePortas;

    public Carro(String modelo, String marca, int quantidadeDePortas) {
        super(modelo, marca);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void mostrarInfosCarro(){
        System.out.println("------------------------------------");
        System.out.println("Marca: " + this.getMarca() +
                    "\nModelo: " + this.getModelo() +
                    "\nQuantidade de portas: " + this.getQuantidadeDePortas()
        );
        System.out.println("------------------------------------");
    }
}
