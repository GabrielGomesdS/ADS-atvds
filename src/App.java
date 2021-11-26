public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco conta = new ContaBanco();
        conta.saca();
        conta.deposita(10.00f);
    }
}
