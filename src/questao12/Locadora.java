package src.questao12;

import src.questao12.db.Estoque;
import src.questao12.entities.Veiculo;

import java.util.List;

public class Locadora {

    public static void main(String [] args){

        System.out.println("==========================================");
        System.out.println("LOCADORA DEVFORCE");
        System.out.println("==========================================");

        List<Veiculo> estoque = Estoque.retornarEstoque();

        for (Veiculo veiculo : estoque){
            System.out.println(veiculo.toString());
        }


    }

}
