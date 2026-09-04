package src.questao11;

import src.questao11.entities.MembroAkatsuki;
import src.questao11.entities.Ninja;
import src.questao11.util.Combate;

public class Game {

    public static void main(String [] args){

        String nome = "Orochimaru";
        int vida = 100;
        String vila = "Vila da folha";
        int nivel = 7;
        String habilidadeEspecial = "Jutsu de imortalidade";
        String naturezaDoChakra = "Vento";
        MembroAkatsuki orochimaru = new MembroAkatsuki(nome, vida, vila, nivel, habilidadeEspecial, naturezaDoChakra);

        nome = "Naruto";
        vida = 100;
        vila = "Vila da folha";
        nivel = 6;
        habilidadeEspecial = "Bijuu sage mode";
        naturezaDoChakra = "Vento";
        Ninja naruto = new Ninja(nome, vida, vila, nivel, habilidadeEspecial, naturezaDoChakra);

        System.out.println(orochimaru.toString());
        System.out.println(naruto.toString());

        Combate.iniciarLuta(naruto, orochimaru);


    }

}
