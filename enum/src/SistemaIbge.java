public class SistemaIbge {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()){
      System.out.println(e.getSigla() + "-" + e.getNome());
    }
    EstadoBrasileiro meuEstado = EstadoBrasileiro.RIO_JANEIRO;

    System.out.println("Meu estado é " + meuEstado.getNome() + " e sua sigla é " + meuEstado.getSigla());
  }
}
