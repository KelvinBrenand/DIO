package Decorator;
/*
Decorator: Permite que um comportamento seja adicionado a um objeto individual, dinamicamente, sem afetar o comportamento de
outros objetos da mesma classe.
Neste caso, ao utilizar o Decorator, fomos capazes de adcionar melhorias ao Ford Model A "meuCarro", sem afetar possiveis 
outros objetos da mesma classe.
*/
public class Main {
    public static void printInfo(FordA A){
        System.out.println("Nome: "+A.getName()+"\nCor: "+A.getColor()+"\nTechnical Specs: "+A.getTechnicalSpecs()
                            +"\nCusto: "+A.getCost()+"\n");
    }
    public static void main(String[] args) {
        FordA meuCarro = new FordAStandard();
        printInfo(meuCarro);
        meuCarro = new FordAAutomatico(meuCarro);
        printInfo(meuCarro);
        meuCarro = new FordAArCondicionado(meuCarro);
        printInfo(meuCarro);
        meuCarro = new FordAVidroEletrico(meuCarro);
        printInfo(meuCarro);
    }
}
