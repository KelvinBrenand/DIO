package Strategy;

public class ComportamentoLento implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se lentamente...");
    }
}
