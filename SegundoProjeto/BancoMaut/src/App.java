import java.time.LocalDate;

public class App { 

  public static void main(String[] args) {
    LocalDate dataNascimento = LocalDate.of(2003, 05, 30);
    Fregues fregues1 = new Fregues("Gabriel", "857289036", new Endereco("centro 1", 12, "bairro", "Acauã", "PI"),
    dataNascimento);
    ContaBanco contaBanco1 = new ContaBanco(923, 667, fregues1);
    System.out.println("Agencia: " + contaBanco1.getAgencia() +", " + " numero: " + contaBanco1.getNumero() + "," + " nome: " +
    contaBanco1.getFregues().setnome());
    contaBanco1.depositar(300);
    
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
    
    
    contaBanco1.sacar(250);
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
    
    contaBanco1.depositar(3000);
    System.out.println("Seu saldo atual da primeira conta de banco é: " + contaBanco1.getSaldo());
   

    System.out.println(contaBanco1.getAgencia());
    
    ContaBanco contaBanco2 = new ContaBanco(479, 928, fregues1);
    System.out.println(contaBanco2.getAgencia() + " - " + contaBanco2.getNumero() + " - " +
    
    
    contaBanco2.getFregues().setnome());
    System.out.println("");
    
    contaBanco1.transferencia(contaBanco2, 500);
    System.out.println("saldo da segunda conta de banco é: "+ contaBanco2.getSaldo() + " :'Logo após a tranfêrencia'");
    System.out.println("valor da primeira conta de banco é: " + contaBanco1.getSaldo() + " :'Logo após a tranfêrencia'");
    
  
    }
}
      
      
    