package Facade;
/*
Facade: Promover uma interface que reduza a complexidade nas integrações com subsistemas.
Neste caso, ao utilizar o facade, fomos capazes de simplificar o metodo migrarCliente pois agora o usuário necessita apenas
informar o cep (e não cep+cidade+estado) e o método, usando o CepApi, corre atrás das outras informações.
*/
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Kelvin", "12345678");
    }
}
