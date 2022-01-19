package Decorator;

public class FordAStandard implements FordA{

    @Override
    public String getName() {
        return "Ford Model A";
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getTechnicalSpecs() {
        return "1927, 0km, Gasolina";
    }

    @Override
    public Integer getCost() {
        return 385;
    }
    
}
