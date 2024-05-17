public abstract class Conta {
  protected String numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(String numero, Cliente cliente) {
      this.numero = numero;
      this.cliente = cliente;
      this.saldo = 0.0;
  }

  public String getNumero() {
      return numero;
  }

  public double getSaldo() {
      return saldo;
  }

  public Cliente getCliente() {
      return cliente;
  }

  public void depositar(double valor) {
      if (valor > 0) {
          saldo += valor;
      } else {
          System.out.println("Valor de depósito deve ser positivo.");
      }
  }

  public void sacar(double valor) {
      if (valor > 0 && saldo >= valor) {
          saldo -= valor;
      } else {
          System.out.println("Saldo insuficiente ou valor de saque inválido.");
      }
  }

  public abstract void calcularRendimentos();
}
