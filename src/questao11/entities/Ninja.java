package src.questao11.entities;

import src.questao11.enums.CategoriaNinja;

public class Ninja extends Personagem{

    private CategoriaNinja categoriaNinja;
    private String habilidadeEspecial;
    private String naturezaDoChakra;

    public Ninja(String nome, double vida, String vila, int nivelNinja, String habilidadeEspecial, String naturezaDoChakra) {
        super(nome, vida, vila);
        this.categoriaNinja = CategoriaNinja.fromNivel(nivelNinja);
        this.habilidadeEspecial = habilidadeEspecial;
        this.naturezaDoChakra = naturezaDoChakra;
    }

    public CategoriaNinja getCategoriaNinja() {
        return categoriaNinja;
    }

    private void setCategoriaNinja(CategoriaNinja categoriaNinja) {
        this.categoriaNinja = categoriaNinja;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    private void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getNaturezaDoChakra() {
        return naturezaDoChakra;
    }

    private void setNaturezaDoChakra(String naturezaDoChakra) {
        this.naturezaDoChakra = naturezaDoChakra;
    }

    @Override
    public String toString() {
        return  super.toString() + "Ninja{" +
                "categoriaNinja=" + categoriaNinja +
                ", habilidadeEspecial='" + habilidadeEspecial + '\'' +
                ", naturezaDoChakra='" + naturezaDoChakra + '\'' +
                "} ";
    }
}
