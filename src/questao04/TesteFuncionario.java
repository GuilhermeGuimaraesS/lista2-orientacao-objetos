package questao04;

import questao04.entities.Funcionario;

import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Salário: ");
        double salario = entrada.nextDouble();
        System.out.println("====================================");

        Funcionario novoFuncionario = new Funcionario(nome);
        novoFuncionario.registrarSalario(salario);
        novoFuncionario.mostrarDadosDoFuncionario();

    }

}
