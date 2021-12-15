import java.time.LocalDate;

public class App { 

  public static void main(String[] args) {
    LocalDate dataNascimento = LocalDate.of(2003, 05, 30);
    Fregues fregues1 = new Fregues("Gabriel", "857289036", new Endereco("centro 1", 12, "bairro", "Acauã", "PI"),
    dataNascimento);
    Fregues fregues2 = new Fregues("Pedro", "124384638", new Endereco("centro 1", 12, "bairro", "Acauã", "PI"),
    dataNascimento);

ContaBanco contaBanco1 = new ContaBanco(1, 1, fregues1);
ContaBanco contaBanco2 = new ContaBanco(1, 2, fregues2);

contaBanco1.depositar(500);
contaBanco1.tranferencia(250, contaBanco2);
contaBanco2.sacar(100);

System.out.println(contaBanco1.getSaldo());
System.out.println(contaBanco2.getSaldo());

}

}
      
      
    