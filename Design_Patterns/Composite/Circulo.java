public class Circulo implements Figura{
    private Ponto ponto1;
    private Ponto ponto2;
    private Reta reta1;

    public Circulo(double x1, double y1, double x2, double y2){
        this.ponto1 = new Ponto(x1,y1);
        this.ponto2 = new Ponto(x2,y2);
        this.reta1 = new Reta(ponto1, ponto2);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(reta1.getLargura(),2);
    }

    @Override
    public void desenhar() {
        System.out.println("\nCirculo");
    }

    public void areaToString(){
        System.out.println("A área deste circulo é de: "+String.format("%.2f", this.area()));
    }
}
