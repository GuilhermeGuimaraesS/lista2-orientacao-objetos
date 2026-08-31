package questao07.entities;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String modelo, String marca, int cilindradas) {
        super(modelo, marca);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    private void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void mostrarInfosMoto(){
        System.out.println("------------------------------------");
        System.out.println("Marca: " + this.getMarca() +
                "\nModelo: " + this.getModelo() +
                "\nCilindradas: " + this.getCilindradas() +"cc"
        );
        System.out.println("------------------------------------");
    }

}
