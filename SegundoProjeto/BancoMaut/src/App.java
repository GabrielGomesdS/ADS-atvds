import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    Fregues fregues1 = new Fregues("Gabriel","857289036","Acauã", LocalDate.parse("2003-06-30"));
    ContaBanco contaBanco1 = new ContaBanco(923, 667, fregues1);
    System.out.println("Agencia: " + contaBanco1.getAgencia() +", " + " numero: " + contaBanco1.getNumero() + "," + " nome: " +
    contaBanco1.getFregues().getnome());
    contaBanco1.depositar(200);
    
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
    
    
    contaBanco1.sacar(150);
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
    
    contaBanco1.depositar(1000);
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
   

    System.out.println(contaBanco1.getAgencia());
    
    ContaBanco contaBanco2 = new ContaBanco(479, 928, fregues1);
    System.out.println(contaBanco2.getAgencia() + " - " + contaBanco2.getNumero() + " - " +
    
    
    contaBanco2.getFregues().getnome());
    System.out.println("");
    
    contaBanco1.transferencia(contaBanco2, 500);
    System.out.println("saldo da segunda conta de banco é: "+ contaBanco2.getSaldo() + " :'Logo após a tranfêrencia'");
    System.out.println("valor da primeira conta de banco é: " + contaBanco1.getSaldo() + " :'Logo após a tranfêrencia'");
    
  
    }
}
      
      
    