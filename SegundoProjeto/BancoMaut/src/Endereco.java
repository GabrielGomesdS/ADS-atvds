public class Endereco{
  private int numero; 
  private String uf;  
  private String bairro;
  private String cidade;
  private String centro;
  public Endereco(String centro, int numero, String bairro, String cidade, String uf) {
    this.centro = centro;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
}

public String getcentro() {
    return centro;
}

public void setcentro(String centro) {
    this.centro = centro;
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public String getBairro() {
    return bairro;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

public String getCidade() {
    return cidade;
}

public void setCidade(String cidade) {
    this.cidade = cidade;
}

public String getUf() {
    return uf;
}

public void setUf(String uf) {
    this.uf = uf;
}

}