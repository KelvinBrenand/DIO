abstract public class Conteudo {
    protected String titulo;
    protected String descricao;
    protected final double XP_PADRAO = 10d;
    
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return "Conteudo [XP_PADRAO=" + XP_PADRAO + ", descricao=" + descricao + ", titulo=" + titulo + "]";
    }
    abstract public double calcular_xp();


}
