public class Main {
  public static void main(String[] args) {
      Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
      ContaCorrente cc = new ContaCorrente("001", cliente1, 10.0);
      ContaPoupanca cp = new ContaPoupanca("002", cliente1, 0.05);

      cc.depositar(500);
      cp.depositar(500);

      cc.sacar(50);
      cp.calcularRendimentos();

      System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
      System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

      cc.cobrarTaxaManutencao();

      System.out.println("Saldo Conta Corrente após taxa: " + cc.getSaldo());
  }
}

