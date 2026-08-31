package questao04.entities;

import java.util.UUID;
import java.text.DecimalFormat;

public class Funcionario {

    private UUID id;
    private String nome;
    private double salario;

    public Funcionario(String nome){
        this.id = UUID.randomUUID();
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.salario = salario;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public void registrarSalario(double salario){
        if (salario < 0){
            System.out.println("Não é possível registrar um salário com valor negativo!");
        } else {
            setSalario(salario);
        }
    }

    public void mostrarDadosDoFuncionario(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("------------------------------------");
        System.out.println("id: " + getId().toString() +
                "\nNome: " + getNome() +
                "\nSalario: R$" + df.format(getSalario())
        );
        System.out.println("------------------------------------");
    }

}
