package State;
/*
State: Modifica o comportamento de um objeto quando o estado desse objeto muda durante runtime. Com isso, um objeto
eh capaz de diferentes acoes, dependendo do seu estado.
Neste caso, o comportamento da central de atendimento muda de estado durante runtime a depender do horário.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader fileInputStream=new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(fileInputStream);
        State state = new ClosingTimeState();
        System.out.println("Escreva qualquer coisa para encerrar.");
        do {
            if (LocalTime.now().isAfter(LocalTime.parse("08:00:00.00")) && //Modificar os horarios para testar
                    LocalTime.now().isBefore(LocalTime.parse("19:00:00.00"))) {
                state = new WorkTimeState();
            } else if(state.getClass() == WorkTimeState.class) {
                state = new ClosingTimeState();
            }
            state.getState();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!bufferedReader.ready());
        System.out.println("Desligando...");
    }
}