public class Notificacao {

  public void enviarEmail(String operacao, double valor) {
    System.out.println("~~~~~> Enviando email ~~~~~>");
    System.out.println("Esta operação foi realizada com sucesso: " + operacao);
    System.out.println("O valor atual é: " + valor);
    System.out.println("***** Email enviado *****");
  }
}