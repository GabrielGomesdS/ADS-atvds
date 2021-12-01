
import java.time.LocalDate;

public class Fregues {
  private String nome;
  private String CPF;
  private String endereco;
  private LocalDate dataNascimento;
  
  public Fregues(String nome, String CPF, String endereco, LocalDate dataNascimento ){
    
    this.nome = nome;
    this.CPF = CPF;
    this.endereco = endereco;
    this.dataNascimento = dataNascimento;

  }

  public String getnome() {
      return nome;
  }

  public String getCPF() {
      return CPF;
  }

  public String getendereco() {
      return endereco;
  }

  public LocalDate getdataNascimento() {
      return dataNascimento;
  }
  
}