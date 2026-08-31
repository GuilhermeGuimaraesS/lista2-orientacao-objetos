package questao05;

import questao05.entities.Calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("Inteiro 01: ");
        int inteiro01 = entrada.nextInt();
        System.out.println("Inteiro 02: ");
        int inteiro02 = entrada.nextInt();

        int resultado01 = Calculadora.somar(inteiro01, inteiro02);
        System.out.println("Resultado01: " + resultado01);

        System.out.println("Racional 01: ");
        double racional01 = entrada.nextDouble();
        System.out.println("Racional 02: ");
        double racional02 = entrada.nextDouble();
        double resultado02 = Calculadora.somar(racional01, racional02);
        System.out.println("Resultado02: " + df.format(resultado02));

        System.out.println("Inteiro 01: ");
        inteiro01 = entrada.nextInt();
        System.out.println("Inteiro 02: ");
        inteiro02 = entrada.nextInt();
        System.out.println("Inteiro 03: ");
        int inteiro03 = entrada.nextInt();
        int resultado03 = Calculadora.somar(inteiro01, inteiro02, inteiro03);
        System.out.println("Resultado03: " + resultado03);


    }
}
