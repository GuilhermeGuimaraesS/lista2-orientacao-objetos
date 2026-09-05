package src.questao12.db;

import src.questao12.entities.Moto;
import src.questao12.entities.Van;
import src.questao12.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private static Van sprinter01 = new Van("Mercedez", "Sprinter", 4, "prata",
            5, 16, "Passageiros");
    private static Van sprinter02 = new Van("Mercedez", "Sprinter", 4, "branca",
            5,"Carga");

    private static Moto moto01 = new Moto("Honda", "Bros", 2, "vermelha", 160,
            "Roda Dianteira");

    private static Moto moto02 = new Moto("Bajaj", "Dominar NS200", 2, "preta", 200,
            "Canal Duplo");

    static List<Veiculo> estoque = new ArrayList<>();

    public static List<Veiculo> retornarEstoque(){
        estoque.add(sprinter01);
        estoque.add(sprinter02);
        estoque.add(moto01);
        estoque.add(moto02);
        return estoque;
    }


}
