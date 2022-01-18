import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private double xp;
    private List<Bootcamp> bootcampsInscritos = new ArrayList<>();
    private List<Bootcamp> bootcampsFinalizados = new ArrayList<>();
    
    public Dev(String nome) {
        this.nome = nome;
        this.xp = 0d;
    }
    public String getNome() {
        return nome;
    }
    public double getXp() {
        return xp;
    }
    public List<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }
    public List<Bootcamp> getBootcampsFinalizados() {
        return bootcampsFinalizados;
    }
    @Override
    public String toString() {
        return "Dev [bootcampsFinalizados=" + bootcampsFinalizados + ", bootcampsInscritos=" + bootcampsInscritos
                + ", nome=" + nome + ", xp=" + xp + "]";
    }
    public void inscreverBootcamp(Bootcamp bootcamp){
        bootcampsInscritos.add(bootcamp);
    }
    public void progredir(Bootcamp bootcamp){
        if (bootcampsInscritos.contains(bootcamp)) {
            bootcampsFinalizados.add(bootcamp);
            total_xp(bootcamp);
            bootcampsInscritos.remove(bootcamp);
        }
    }
    private void total_xp(Bootcamp bootcamp){
        double total_xp = 0d;
        for (int i = 0; i < bootcamp.conteudos.size(); i++) {
            total_xp += bootcamp.conteudos.get(i).calcular_xp();
        }
        this.xp = total_xp;
    }

}
