public class App {

        public static void main(String[] args) {
      
          ContaBanco contaBanco1 = new ContaBanco();
          contaBanco1.agencia = 7587;
          contaBanco1.numero = 489534656;
          contaBanco1.saldo = 2783456;
      
          Fregues fregues1 = new Fregues();
          fregues1.nome = "Gabriel";
          fregues1.CPF = "857289036";
      
          contaBanco1.Fregues = Fregues1;
      
          System.out.println("agencia da conta: " + contaBanco1.agencia);
          System.out.println("número da conta: " + contaBanco1.numero);
          System.out.println("nome do cliente da conta: " + contaBanco1.Fregues.nome);
          System.out.println("cpf do cliente da conta: " + contaBanco1.Fregues.CPF);
        }
      
      }
    