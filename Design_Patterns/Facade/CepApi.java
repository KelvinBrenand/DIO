package Facade;
//Subsistema2
public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance() {
        return instance;
    }
    public String recuperarCidade(String cep){
        return "Joao-Pessoa";
    }
    public String recuperarEstado(String cep){
        return "Paraiba";
    }
}
