public class Atividade extends Conteudo{
    private int cargaHoraria;
    
    public Atividade(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcular_xp() {
        return XP_PADRAO+(this.cargaHoraria*3d);
    }
}
