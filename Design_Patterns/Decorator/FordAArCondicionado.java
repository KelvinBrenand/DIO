package Decorator;

public class FordAArCondicionado extends DecoratorFordA {

    public FordAArCondicionado(FordA A) {
        super(A);
    }

    @Override
    public Integer getCost() {
        return super.getCost()+100;
    }

    @Override
    public String getTechnicalSpecs() {
        return super.getTechnicalSpecs()+", Ar Condicionado";
    }
    
}
