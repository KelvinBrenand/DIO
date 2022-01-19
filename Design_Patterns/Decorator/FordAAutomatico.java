package Decorator;
public class FordAAutomatico extends DecoratorFordA{

    public FordAAutomatico(FordA A) {
        super(A);
    }

    @Override
    public Integer getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getTechnicalSpecs() {
        return super.getTechnicalSpecs()+", Automatico";
    }
    
}