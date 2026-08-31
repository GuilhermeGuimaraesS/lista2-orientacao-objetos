package questao02.entities;

import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private int idade;
    private String curso;

    public Aluno(){
        this.id = UUID.randomUUID();
    }

    public Aluno(String nome){
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public Aluno(String nome, int idade, String curso) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarInfosDoAluno(){
        System.out.println("------------------------------------");
        System.out.println("id: " + getId().toString() +
                        "\nNome: " + getNome() +
                        "\nIdade: " + getIdade() +
                        "\nCurso: " + getCurso()

        );
        System.out.println("------------------------------------");
    }
}
