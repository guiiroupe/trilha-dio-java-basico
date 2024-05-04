public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("2376564");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O cep deve possuir 8 digitos numericos.");
    }
    
  }
  static String formatarCep(String cep) throws CepInvalidoException{
    //throws lança a exceção e throw cria a execeção
    if(cep.length() != 8)
      throw new CepInvalidoException();
    
      //simulando um cep formatado
      return "23.765-064";
}
  
}
