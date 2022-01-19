package Strategy;
/*
Strategy: Simplificar a variação de algoritmos para a resolução de um mesmo problema.
Neste caso, usando a interface Comportamento, podemos alterar facilmente o atributo comportamento do robo.
*/
public class Main {
    public static void main(String[] args) {
        Comportamento lento = new ComportamentoLento();
        Comportamento normal = new ComportamentoNormal();
        Comportamento rapido = new ComportamentoRapido();
        Robo rob = new Robo();

        rob.setStrategy(lento);
        rob.mover();
        rob.setStrategy(normal);
        rob.mover();
        rob.setStrategy(rapido);
        rob.mover();
    }
}
