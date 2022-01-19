package Decorator;

public class FordAVidroEletrico extends DecoratorFordA {

    public FordAVidroEletrico(FordA A) {
        super(A);
    }

    @Override
    public Integer getCost() {
        return super.getCost()+40;
    }

    @Override
    public String getTechnicalSpecs() {
        return super.getTechnicalSpecs()+", Vidro elétrico";
    }
    
}
