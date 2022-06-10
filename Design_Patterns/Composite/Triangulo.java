public class Triangulo implements Figura{

    private Ponto ponto1;
    private Ponto ponto2;
    private Ponto ponto3;
    private Reta reta1;
    private Reta reta2;
    private Reta reta3;

    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
        this.ponto1 = new Ponto(x1,y1);
        this.ponto2 = new Ponto(x2,y2);
        this.ponto3 = new Ponto(x3,y3);
        this.reta1 = new Reta(ponto1, ponto2);
        this.reta2 = new Reta(ponto2, ponto3);
        this.reta3 = new Reta(ponto1, ponto3);
    }
    @Override
    public double area(){
        double s = (reta1.getLargura()+reta2.getLargura()+reta3.getLargura())/2;
        return Math.sqrt(s*(s - reta1.getLargura())*(s - reta2.getLargura())*(s - reta3.getLargura()));
    }

    @Override
    public void desenhar() {
        System.out.println("\nTriangulo");
    }

    public void areaToString(){
        System.out.println("A área deste triângulo é de: "+String.format("%.2f", this.area()));
    }
}
