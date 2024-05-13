package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  //Nessa clase não precisamos implementar a interface Comparable pois estamos trabalhando com Integer.
  private List<Integer> numerosList;

  public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero){
    numerosList.add(numero);
  }

  public List<Integer> ordenarAscendente(){
    List<Integer> listAscendente = new ArrayList<>(numerosList);
    if (!numerosList.isEmpty()) {
      Collections.sort(listAscendente);
      return listAscendente;
    }else{
      throw new RuntimeException("A lista está vazia!");
    }   
  }

  public List<Integer> ordenarDescendente(){
    List<Integer> listDescendente = new ArrayList<>(numerosList);
    if (!numerosList.isEmpty()) {
      listDescendente.sort(Collections.reverseOrder());
      return listDescendente;
    }else{
      throw new RuntimeException("A lista está vazia!");
    }   
  }

  public void exibirNumero(){
    if (!numerosList.isEmpty()) {
      System.out.println(numerosList);
    }else{
      throw new RuntimeException("A lista está vazia!");
    }
  }

  @Override
  public String toString() {
    return "OrdenacaoNumeros [numerosList=" + numerosList + "]";
  }

  
  public static void main(String[] args) {
    OrdenacaoNumeros minhaOrdenacao = new OrdenacaoNumeros();

    minhaOrdenacao.adicionarNumero(3);
    minhaOrdenacao.adicionarNumero(1);
    minhaOrdenacao.adicionarNumero(102);
    minhaOrdenacao.adicionarNumero(2);
    minhaOrdenacao.adicionarNumero(200);

    minhaOrdenacao.exibirNumero();

    System.out.println(minhaOrdenacao.ordenarAscendente());
    System.out.println(minhaOrdenacao.ordenarDescendente());
  }
}
