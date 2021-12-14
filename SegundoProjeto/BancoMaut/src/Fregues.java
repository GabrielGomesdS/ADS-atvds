
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fregues {
  private String nome;
  private String CPF;
  private List<Endereco> endereco = new ArrayList<>();;
  private LocalDate dataNascimento;
  
  public Fregues(String nome, String CPF,Endereco endereco, LocalDate dataNascimento ){
    
    this.nome = nome;
    this.CPF = CPF;
    this.endereco.add(endereco);
    this.dataNascimento = dataNascimento;

  }

  public String setnome() {
      return nome;
  }

  public String getCPF() {
      return CPF;
  }
  
  public List<Endereco> getEnderecos() {
    return endereco;
  }

  public LocalDate getdataNascimento() {
      return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

}