import java.time.LocalDate;
import java.util.List;

public class Bootcamp{
    protected LocalDate dataInicial;
    protected LocalDate dataFinal;
    protected String nome;
    protected String descricao;
    protected List<Conteudo> conteudos;
    public Bootcamp(String nome, String descricao, List<Conteudo> conteudos) {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(30);
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos = conteudos;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return "Bootcamp [conteudos=" + conteudos + ", dataFinal=" + dataFinal + ", dataInicial=" + dataInicial
                + ", descricao=" + descricao + ", nome=" + nome + "]";
    }  
}