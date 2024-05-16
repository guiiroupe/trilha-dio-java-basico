package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {
  /**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

 public static void main(String[] args) {
  List<Integer> numeros = Arrays.asList(1,2,3,4,5);

  BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

  int somaDaLista = numeros.stream().reduce(0, soma);

  System.out.println("A soma total é: " + somaDaLista);
 }
}
