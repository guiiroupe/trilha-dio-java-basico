package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemple {

  /**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5);

    Function<Integer,Integer> dobrarFunction = numero -> numero * 2;

    List<Integer> numerosDobrados = numeros.stream().map(dobrarFunction).toList();

    numerosDobrados.forEach(s -> System.out.println(s));
  }
  
}
