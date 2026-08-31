package questao02;

import java.util.Scanner;
import questao02.entities.Aluno;

public class Cardeneta {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("CADASTRO DE ALUNOS");
        System.out.println("Nome: ");
        String nome01 = entrada.nextLine();
        Aluno aluno01 = new Aluno(nome01);
        aluno01.mostrarInfosDoAluno();

        System.out.println("====================================");
        System.out.println("Nome: ");
        String nome02 = entrada.nextLine();
        System.out.println("Idade: ");
        int idade02 = entrada.nextInt();
        System.out.println("Curso: ");
        entrada.nextLine();
        String curso02 = entrada.nextLine();
        Aluno aluno02 = new Aluno(nome02, idade02, curso02);
        aluno02.mostrarInfosDoAluno();

        Aluno aluno03 = new Aluno();
        aluno03.mostrarInfosDoAluno();

    }

}
