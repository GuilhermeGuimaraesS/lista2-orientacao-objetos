package questao07;

import questao07.entities.Carro;
import questao07.entities.Moto;

import java.util.Scanner;

public class TesteVeiculos {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Digite as informações do carro: ");
        System.out.println("====================================");
        System.out.println("Marca: ");
        String marcaCarro = entrada.nextLine();
        System.out.println("Modelo: ");
        String modeloCarro = entrada.nextLine();
        System.out.println("Quantidade de portas: ");
        int quantidadeDePortas = entrada.nextInt();

        Carro carro = new Carro(marcaCarro, modeloCarro, quantidadeDePortas);
        carro.mostrarInfosCarro();

        System.out.println("====================================");
        System.out.println("Digite as informações da moto: ");
        System.out.println("====================================");
        System.out.println("Marca: ");
        entrada.nextLine();
        String marcaMoto = entrada.nextLine();
        System.out.println("Modelo: ");
        String modeloMoto = entrada.nextLine();
        System.out.println("Cilindradas: ");
        int cilindradas = entrada.nextInt();

        Moto moto = new Moto(marcaMoto, modeloMoto, cilindradas);
        moto.mostrarInfosMoto();

    }

}
