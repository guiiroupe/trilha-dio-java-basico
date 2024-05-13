package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> listaNumeros;

  public SomaNumeros() {
    this.listaNumeros = new ArrayList<>();
  } 

  public void adicionarNumero(int numero){
    listaNumeros.add(numero);
  }

  public int calcularSoma(){
    int resultado = 0;
    for(Integer i : listaNumeros){
      resultado += i;
    }
    return resultado;
  }

  public int encontrarMaiorNumero(){
    int maiorNumero = -100;
    for(Integer i : listaNumeros){
      if (i > maiorNumero) {
        maiorNumero = i; 
      }
    }
    return maiorNumero;
  }

  public int encontrarMenorNumero(){
    int menorNumero = 10000;
    for(Integer i : listaNumeros){
      if (i < menorNumero) {
        menorNumero = i;
      }
    }
    return menorNumero;
  }

  public List<Integer> exibirNumeros(){
    List<Integer> numerosDaLista = new ArrayList<>();
    for(Integer i : listaNumeros){
      numerosDaLista.add(i);
    }
    return numerosDaLista;
  }

  @Override
  public String toString() {
    return "SomaNumeros [listaNumeros=" + listaNumeros + "]";
  }

  public static void main(String[] args) {
    SomaNumeros minhSomaNumeros = new SomaNumeros();

    minhSomaNumeros.adicionarNumero(34);
    minhSomaNumeros.adicionarNumero(100);
    minhSomaNumeros.adicionarNumero(23);
    minhSomaNumeros.adicionarNumero(21);
    minhSomaNumeros.adicionarNumero(14);
    minhSomaNumeros.adicionarNumero(121);
    minhSomaNumeros.adicionarNumero(12);
    minhSomaNumeros.adicionarNumero(5);

    System.out.println(minhSomaNumeros.encontrarMaiorNumero());
    System.out.println(minhSomaNumeros.encontrarMenorNumero());
    System.out.println(minhSomaNumeros.calcularSoma());
    System.out.println(minhSomaNumeros.exibirNumeros());

  }

  
}
