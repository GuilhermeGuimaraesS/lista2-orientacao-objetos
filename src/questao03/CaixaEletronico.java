package questao03;

import questao03.entities.ContaBancaria;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ABRIR CONTA");
        System.out.println("Digite o nome do titular: ");
        String titular = entrada.nextLine();
        ContaBancaria novaConta = new ContaBancaria(titular);

        novaConta.mostrarSaldo();
        novaConta.depositarDinheiro(500);
        novaConta.sacarDinheiro(-200);
        novaConta.sacarDinheiro(700);

    }

}
