public abstract class Veiculo {
  private int chassi;

    public void setChassi(int chassi) {
      this.chassi = chassi;
    }
    public int getChassi() {
      return chassi;
    }
    public abstract void ligar();
}
