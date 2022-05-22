package State;

public class ClosingTimeState extends State{
    @Override
    public void getState() {
        System.out.println("Fora do horario de funcionamento! :(");
    }
}
