package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
  /**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "c", "c#", "go");

    Predicate<String> maiorQueCincoLetras = palavra -> palavra.length() > 5;

    palavras.stream().filter(maiorQueCincoLetras).forEach(s -> System.out.println(s));
  }
}
