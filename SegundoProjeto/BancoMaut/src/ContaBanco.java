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
  public void depositar(double valor){
    if (valor < 0){
        System.out.println("Não é permitido o depositar de valores negativos");
    }
    this.saldo += valor;
    System.out.println("Aqui está o Valor depositado, o seu saldo atual é: " + saldo);
    this.enviaNotificacao("Valor depositado", valor);
}
public boolean sacar(double valor){
    if(valor <= saldo){
        saldo -= valor;
        System.out.println("Saque realizado com sucesso, o seu saldo atual é: " + saldo);
        this.enviaNotificacao("Valor sacado", valor);        
        return true;
    } else{
        System.out.println("Você não tem o suficiente para poder sacar esse valor");
    }   return false;
}
public void tranferencia(double valor, ContaBanco contaDestino) {
    System.out.println("Transferindo valor de uma conta para outra =>=>");
    boolean saqueComSucesso = this.sacar(valor);
    if (saqueComSucesso){
        contaDestino.depositar(valor);
    }
    this.enviaNotificacao("transferncia", valor);
}
private void enviaNotificacao(String operacao, double valor ){
    new Notificacao().enviarEmail(operacao, valor);
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
