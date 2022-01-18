import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now().plusDays(5);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData() {
        return data;
    }
    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", descricao=" + descricao + ", titulo=" + titulo + "]";
    }
    @Override
    public double calcular_xp() {
        return XP_PADRAO+20d;
    }
}
