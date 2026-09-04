package src.questao11.entities;

import src.questao11.enums.CategoriaNinja;

public class MembroAkatsuki extends Personagem {

        private CategoriaNinja categoriaNinja;
        private CategoriaNinja categoriaNinja2;
        private String habilidadeEspecial;
        private String naturezaDoChakra;
        private MembroAkatsuki parceiro;

    public MembroAkatsuki(String nome, double vida, String vila, int nivelNinja , String habilidadeEspecial, String naturezaDoChakra) {
        super(nome, vida, vila);
        this.categoriaNinja = CategoriaNinja.fromNivel(nivelNinja);
        this.habilidadeEspecial = habilidadeEspecial;
        this.naturezaDoChakra = naturezaDoChakra;
        this.categoriaNinja2 = CategoriaNinja.NUKENIN;

    }

    public CategoriaNinja getCategoriaNinja() {
        return categoriaNinja;
    }

    private void setCategoriaNinja(CategoriaNinja categoriaNinja) {
        this.categoriaNinja = categoriaNinja;
    }

    public CategoriaNinja getCategoriaNinja2() {
        return categoriaNinja2;
    }

    private void setCategoriaNinja2(CategoriaNinja categoriaNinja2) {
        this.categoriaNinja2 = categoriaNinja2;
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

    public MembroAkatsuki getParceiro() {
        return parceiro;
    }

    private void setParceiro(MembroAkatsuki parceiro) {
        this.parceiro = parceiro;
    }

    @Override
    public String toString() {
        return super.toString() + "MembroAkatsuki{" +
                "categoriaNinja=" + categoriaNinja +
                ", categoriaNinja2=" + categoriaNinja2 +
                ", habilidadeEspecial='" + habilidadeEspecial + '\'' +
                ", naturezaDoChakra='" + naturezaDoChakra + '\'' +
                ", parceiro=" + parceiro +
                "} " ;
    }
}
