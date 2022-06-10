import java.lang.Math;
public class Reta{
    private double largura;

    public Reta(Ponto A, Ponto B){
        this.largura = Math.sqrt(Math.pow((B.getX() - A.getX()),2)+Math.pow((B.getY() - A.getY()),2));
    }

    public double getLargura() {
        return largura;
    }
}
