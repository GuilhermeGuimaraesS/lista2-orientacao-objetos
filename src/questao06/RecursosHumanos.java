package questao06;

import questao06.entities.Funcionario;

import java.util.Scanner;

public class RecursosHumanos {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Idade: ");
        int idade = entrada.nextInt();
        System.out.println("Salário: ");
        double salario = entrada.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, salario);
        funcionario.mostrarDadosDoFuncionario();
    }

}
