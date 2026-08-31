package questao03.entities;

import java.text.DecimalFormat;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    private void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Saldo: " + df.format(getSaldo()));
    }

    public void sacarDinheiro(double valor){
        if (valor > saldo){
            System.out.println("Valor solicitado é maior que o saldo disponível!");
        } else if(valor < 0){
            System.out.println("Impossível realizar saque de valores negativos!");
        }
        else {
            setSaldo(saldo - valor);
            System.out.println("Saque realizado com sucesso!");
            mostrarSaldo();
        }
    }

    public void depositarDinheiro(double valor){
        if (valor < 0){
            System.out.println("Impossível realizar o depósito de valores negativos!");
        } else {
            setSaldo(saldo + valor);
            System.out.println("Depósito realizado com sucesso!");
            mostrarSaldo();
        }
    }

}
