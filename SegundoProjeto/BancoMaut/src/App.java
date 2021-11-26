public class App {

        public static void main(String[] args) {
      
          ContaBanco contaBanco1 = new ContaBanco();
          contaBanco1.agencia = 7587;
          contaBanco1.numero = 489534656;
          contaBanco1.saldo = 2783456;
      
          Fregues fregues1 = new Fregues();
          fregues1.nome = "Gabriel";
          fregues1.CPF = "857289036";
      
          contaBanco1.Fregues = fregues1;
      
          System.out.println("A agência dessa conta é: " + contaBanco1.agencia);
          System.out.println("O número dessa conta é: " + contaBanco1.numero);
          System.out.println("O nome do freguês dono dessa conta é: " + contaBanco1.Fregues.nome);
          System.out.println("O CPF do freguês dono dessa conta é: " + contaBanco1.Fregues.CPF);
        }
      
      }
    