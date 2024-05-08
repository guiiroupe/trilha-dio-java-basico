public class Autodromo{
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.ligar();
    jeep.setChassi(129291);


    Moto z400 = new Moto();
    z400.setChassi(262671);
    z400.ligar();

  }
}