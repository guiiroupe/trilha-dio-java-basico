public class ExemploBreakContinue {
  public static void main(String[] args) {
    /* 
    for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        continue; // só para a iteração quando numero == 3
      
      System.out.println(numero); 
    }

    for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        break; // quebra todo o controle de fluxo ao chegar no 3
      
      System.out.println(numero);
      
    }
    */
    for(int numero = 0; numero <=100; numero ++){
      if(numero % 2 != 0)
        continue; // só para a iteração quando numero == 3
      
      System.out.println(numero); 
    }
  }
}
