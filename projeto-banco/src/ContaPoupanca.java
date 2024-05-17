public class ContaPoupanca extends Conta {
  private double taxaRendimento;

  public ContaPoupanca(String numero, Cliente cliente, double taxaRendimento) {
      super(numero, cliente);
      this.taxaRendimento = taxaRendimento;
  }

  @Override
  public void calcularRendimentos() {
      saldo += saldo * taxaRendimento;
  }
}
