package src.questao10;

import src.questao10.entities.*;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("DIGITE AS INFORMAÇÕES DO CELULAR");
        System.out.println("======================================");
        System.out.println("Marca: ");
        String marca01 = entrada.nextLine();
        Celular celular01 = new Celular(marca01);
        celular01.exibirDados();

        System.out.println("======================================");
        System.out.println("DIGITE AS INFORMAÇÕES DO CELULAR");
        System.out.println("======================================");
        System.out.println("Marca: ");
        String marca02 = entrada.nextLine();
        System.out.println("Modelo: ");
        String modelo02 = entrada.nextLine();
        Celular celular02 = new Celular(marca02, modelo02);
        celular02.exibirDados();

        System.out.println("======================================");
        System.out.println("DIGITE AS INFORMAÇÕES DO CELULAR");
        System.out.println("======================================");
        System.out.println("Marca: ");
        String marca03 = entrada.nextLine();
        System.out.println("Modelo: ");
        String modelo03 = entrada.nextLine();
        System.out.println("Armazenamento: ");
        int armazenamento03 = entrada.nextInt();
        Celular celular03 = new Celular(marca03, modelo03, armazenamento03);
        celular03.exibirDados();

    }

}
