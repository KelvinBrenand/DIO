public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcular_xp() {
        return XP_PADRAO+(this.cargaHoraria*5d);
    }
}
