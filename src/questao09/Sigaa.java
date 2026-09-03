package src.questao09;

import src.questao09.entities.*;
import java.util.Scanner;

public class Sigaa {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("DADOS DO ALUNO");
        System.out.println("==============================");
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Idade: ");
        int idade = entrada.nextInt();
        System.out.println("Matrícula: ");
        entrada.nextLine();
        String matricula = entrada.nextLine();
        System.out.println("Curso: ");
        String curso = entrada.nextLine();

        Aluno novoAluno = new Aluno(nome, idade, matricula, curso);
        System.out.println(novoAluno.toString());

        System.out.println("==============================");
        System.out.println("DADOS DO PROFESSOR");
        System.out.println("==============================");
        System.out.println("Nome: ");
        String nomeProfessor = entrada.nextLine();
        System.out.println("Idade: ");
        int idadeProfessor = entrada.nextInt();
        System.out.println("Disciplina: ");
        entrada.nextLine();
        String disciplina = entrada.nextLine();

        System.out.println("Salario: ");
        double salario = entrada.nextDouble();

        Professor professor = new Professor(nomeProfessor, idadeProfessor, disciplina);
        professor.cadastrarSalario(salario);
        System.out.println(professor.toString());



    }

}
