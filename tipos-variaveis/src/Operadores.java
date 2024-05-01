public class Operadores {
  public static void main(String[] args) {
    //classe Operadores.java

    // operadores aritmeticos 
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);
    //qual o resultado das expressoes abaixo?
    String concatenacao ="?"; 
    System.out.println(concatenacao);

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    // operadores unários

    int numero = 5;
          
    //Imprimindo o numero negativo
    System.out.println(- numero);

    //incrementando numero em mais 1 numero, imprime 6
    numero ++;
    System.out.println(numero);

    //incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero ++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    //ordem de precedencia conta aqui
    System.out.println(++ numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);

    // Operador ternário

    int a = 2;
    int b = 3;

    String resultado = a==b ? "verdadeiro" : "falso";

    System.out.println(resultado);

    //operadores relacionais

    int numeroUm = 100;
    int numeroDois = 20;

    System.out.println(numeroUm == numeroDois);
    System.out.println(numeroUm >= numeroDois);

    String nomeUm = "Guilherme";
    String nomeDois = "Roupe";
    String nomeTres = new String("Guilherme");

    System.out.println(nomeUm == nomeDois);
    System.out.println(nomeUm == nomeTres); // retorna false, nesse caso devemos comparar com o metodo equals

    System.out.println(nomeUm.equals(nomeTres));

    //Operadores Lógicos

    boolean condicaoUm = true;
    boolean condicaoDois = false;

    // o "e" só é true se ambas forem verdadeiras 
    if (condicaoDois && condicaoUm) {
      System.out.println("Ambas verdadeiras");      
    }

    //o "ou" só é verdadeiro se pelo menos uma das condições forem verdadeiras.
    if (condicaoUm || condicaoDois) {
      System.out.println("Pelo menos uma é verdadeira");      
    }
  }
}
