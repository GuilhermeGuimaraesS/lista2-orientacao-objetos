package src.questao11.util;

import src.questao11.entities.*;
import src.questao11.enums.*;

public final class Combate {

    public static void iniciarLuta(Ninja personagem01, MembroAkatsuki personagem02){

        CategoriaNinja categoria01 = personagem01.getCategoriaNinja();
        CategoriaNinja categoria02 = personagem02.getCategoriaNinja();

        if (categoria01.getNivel() > categoria02.getNivel()){
            System.out.println(personagem01.getNome() + " venceu a luta!");
        } else if(categoria01 == categoria02) {
            System.out.println("EMPATE!");
        } else{
            System.out.println(personagem01.getNome() + " perdeu a luta!");
        }
    }

}


