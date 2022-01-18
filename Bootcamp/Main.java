import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conteudo> conteudos = new ArrayList<>();

        conteudos.add(new Mentoria("collections", "Ajuda em collections"));
        conteudos.add(new Atividade("Projeto 1", "Projeto usando OO", 20));
        conteudos.add(new Curso("GIT", "Aprendendo GIT do zero", 15));

        Bootcamp Java1 = new Bootcamp("Java1", "Java para iniciantes", conteudos);

        Dev lucas = new Dev("Lucas");

        lucas.inscreverBootcamp(Java1);
        System.out.println(lucas.toString());

        lucas.progredir(Java1);
        System.out.println(lucas.toString());
    }
}