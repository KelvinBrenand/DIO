class Main {
  public static void main(String[] args) {
    
    Cliente Fon = new Cliente();
    Fon.setNome("Fon");
    
    Conta cc = new ContaCorrente(Fon);
    Conta poupanca = new ContaPoupanca(Fon);
    cc.depositar(100);
    cc.transferir(poupanca, 100);
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}