public abstract class Conta implements IConta{
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;
  
  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;
  
  public Conta(Cliente cliente){
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }
  
  public int getAgencia(){
    return agencia;
  }
  
  public int getNumero(){
    return numero;
  }
  
  public double getSaldo(){
    return saldo;
  }
  
  @Override
  public void sacar(double valor){
    this.saldo = saldo - valor;
  }
  
  @Override
  public void depositar(double valor){
    this.saldo = saldo + valor;
  }
  
  @Override
  public void transferir(Conta contaDestino, double valor){
    this.sacar(valor);
    contaDestino.depositar(valor);
  }
  
  @Override
  public void imprimirExtrato(){
    System.out.println("TITULAR : "+this.cliente.getNome());
    System.out.println("CONTA : "+this.agencia);
    System.out.println("NUMERO : "+this.numero);
    System.out.println("SALDO : "+this.saldo);
  }
}
