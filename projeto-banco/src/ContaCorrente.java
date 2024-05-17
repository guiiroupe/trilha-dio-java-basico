public class ContaCorrente extends Conta {
  private double taxaManutencao;

  public ContaCorrente(String numero, Cliente cliente, double taxaManutencao) {
      super(numero, cliente);
      this.taxaManutencao = taxaManutencao;
  }

  @Override
  public void calcularRendimentos() {
      // Contas correntes geralmente não têm rendimentos
      System.out.println("Conta Corrente não possui rendimentos.");
  }

  public void cobrarTaxaManutencao() {
      if (saldo >= taxaManutencao) {
          saldo -= taxaManutencao;
      } else {
          System.out.println("Saldo insuficiente para cobrar a taxa de manutenção.");
      }
  }
}

