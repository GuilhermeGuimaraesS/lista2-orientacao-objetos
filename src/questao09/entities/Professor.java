package src.questao09.entities;

import java.text.DecimalFormat;

public class Professor extends Pessoa{

    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;

    }

    public String getDisciplina() {
        return disciplina;
    }

    private void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public void cadastrarSalario(double salario){
        if (salario < 0){
            System.out.println("Não é possível cadastrar salário com valor negativo!");
        } else {
            this.setSalario(salario);
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0,000.00");
        return "Professor{" +
                "nome:'" + getNome() + '\'' +
                "idade:'" + getIdade() + '\'' +
                "disciplina:'" + disciplina + '\'' +
                "salario: R$" + df.format(salario) +
                "} ";
    }
}
