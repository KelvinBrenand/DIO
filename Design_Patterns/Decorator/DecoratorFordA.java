package Decorator;

public abstract class DecoratorFordA implements FordA{
    private final FordA decoratedFordModelA;

    public DecoratorFordA(FordA A){
        this.decoratedFordModelA = A;
    }
    @Override
    public String getColor() {
        return this.decoratedFordModelA.getColor();
    }

    @Override
    public Integer getCost() {
        return this.decoratedFordModelA.getCost();
    }

    @Override
    public String getName() {
        return this.decoratedFordModelA.getName();
    }

    @Override
    public String getTechnicalSpecs() {
        return this.decoratedFordModelA.getTechnicalSpecs();
    }
}
