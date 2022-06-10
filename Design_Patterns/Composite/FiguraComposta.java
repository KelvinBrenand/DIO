import java.util.ArrayList;
import java.util.List;

public class FiguraComposta implements Figura{
    protected List<Figura> figuras = new ArrayList<>();

    public FiguraComposta(Figura fig){
        figuras.add(fig);
    }

    public FiguraComposta(List<Figura> figs){
        figuras.addAll(figs);
    }

    @Override
    public double area() {
        double sum = 0;
        for(Figura fig : figuras) sum += fig.area();
        return sum;
    }

    @Override
    public void desenhar() {
        System.out.println("\nA figura composta é dada por: ");
        for(Figura fig : figuras){
            fig.desenhar();
        }
    }

    public void areaToString(){
        System.out.println("A área total das figuras é de: "+String.format("%.2f", this.area()));
    }
}
