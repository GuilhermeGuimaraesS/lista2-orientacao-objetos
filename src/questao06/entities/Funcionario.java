package questao06.entities;

import java.text.DecimalFormat;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDadosDoFuncionario(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("=========================================");
        System.out.println("Nome: " + this.getNome() +
                        "\nIdade: " + this.getIdade() +
                        "\nSalário: R$" + df.format(this.getSalario())
        );
        System.out.println("=========================================");
    }

}
