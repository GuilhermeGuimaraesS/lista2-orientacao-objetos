package src.questao09.entities;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome:'" + getNome() + '\'' +
                "idade:'" + getIdade() + '\'' +
                "matricula:'" + matricula + '\'' +
                "curso:'" + curso + '\'' +
                '}';
    }

}
