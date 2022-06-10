public class TrianguloEscaleno extends Triangulo implements Figura{
    public TrianguloEscaleno(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public void desenhar() {
        System.out.println("\nTrianguloEscaleno");
    }

    public void areaToString(){
        System.out.println("A área deste triângulo escaleno é de: "+String.format("%.2f", this.area()));
    }
}
