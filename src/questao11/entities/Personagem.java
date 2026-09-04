package src.questao11.entities;

public class Personagem {

    private String nome;
    private double vida;
    private String vilaDeOrigem;

    public Personagem(String nome, double vida, String vila) {
        this.nome = nome;
        this.vida = vida;
        this.vilaDeOrigem = vila;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    private void setVida(double vida) {
        this.vida = vida;
    }

    public String getVilaDeOrigem() {
        return vilaDeOrigem;
    }

    public void confronto(Personagem personagem1, Personagem personagem2){

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", vilaDeOrigem='" + vilaDeOrigem + '\'' +
                '}';
    }
}

