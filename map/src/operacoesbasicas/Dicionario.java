package operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra){
    dicionarioMap.remove(palavra);
  }

  public void exibirPalavras(){
    if (!dicionarioMap.isEmpty()) {
      System.out.println(dicionarioMap);
    }else{
      System.out.println("Não existem palavras para serem exibidas");
    }
  }

  public void pesquisarPorPalavra(String palavra){
    System.out.println("A definição da palavra é " + dicionarioMap.get(palavra));
  }

  public static void main(String[] args) {
    Dicionario meuDicionario = new Dicionario();

    meuDicionario.adicionarPalavra("a", "111");
    meuDicionario.adicionarPalavra("b", "112");
    meuDicionario.adicionarPalavra("c", "113");

    meuDicionario.exibirPalavras();

    meuDicionario.removerPalavra("a");

    meuDicionario.exibirPalavras();

    meuDicionario.pesquisarPorPalavra("b");
  }
}
