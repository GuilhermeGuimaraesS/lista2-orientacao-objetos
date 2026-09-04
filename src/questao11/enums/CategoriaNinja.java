package src.questao11.enums;

public enum CategoriaNinja {
    GENIN(1),
    CHUNIN(2),
    JONIN(3),
    JONIN_ESPECIAL(4),
    ANBU(5),
    KAGE(6),
    SANNIN(7),
    NUKENIN(8);

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    CategoriaNinja(int nivel) {
        this.nivel = nivel;
    }

    public static CategoriaNinja fromNivel(int nivel){
        for (CategoriaNinja categoria : CategoriaNinja.values()){
            if (categoria.getNivel() == nivel){
                return categoria;

            }
        }

        throw new IllegalArgumentException("Categoria inválida: " + nivel);
    }
}
