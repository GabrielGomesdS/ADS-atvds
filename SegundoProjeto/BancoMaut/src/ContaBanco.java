public class ContaBanco {
  private  int agencia;
  private  int numero;
  private  double saldo;
  private  Fregues Fregues;
  
  public ContaBanco(int agencia, int numero, Fregues Fregues){
    this.agencia = agencia;
    this.numero = numero;
    this.Fregues = Fregues;
  }
  public void depositar(double deposito){
    if (deposito <= 0){
        System.out.println("É impossivel o deposito com quantias de valores negativos");
    }
    this.saldo += deposito;
    System.out.println("Valor depositado com sucesso, o seu saldo atual é: " + saldo);
  }
  public void sacar(double saque){
    if(saque <= saldo){
        saldo -= saque;
        System.out.println("Saque realizado com sucesso, o seu saldo atual é: " + saldo);
    } else{
        System.out.println("Você não tem quantia monetária suficiente para sacar esse dinheiro");
    }
  }
  public void transferencia(ContaBanco contaBanco2, double valorRc){
    if (saldo <=valorRc ){
      return; 
    }
    this.saldo -= valorRc;
    contaBanco2.trans(valorRc);
    System.out.println("transfererindo para outra conta...");
  }


  public void trans(double valorTf){
    this.saldo += valorTf;
  }

  public int getAgencia() {
    return agencia;
  }

public int getNumero() {
    return numero;
  }

public Fregues getFregues() {
    return Fregues;
  }

public double getSaldo(){
    return saldo;
  }
}