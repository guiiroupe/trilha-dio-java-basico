package pesquisa;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.MinimalHTMLWriter;

public class ContagemPalavra {
  private Map<String, Integer> contagemPalavraMap;

  public ContagemPalavra() {
    this.contagemPalavraMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem){
    contagemPalavraMap.put(palavra, contagem);
  }

  public void removerPalavra(String palavra){
    contagemPalavraMap.remove(palavra);
  }

  public void exibirContagemPalavras(){
    System.out.println(contagemPalavraMap);
  }

  public String encontrarPalavrasMaisFrequente() {
    String palavraMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraMaisFrequente = entry.getKey();
      }
    }
    return palavraMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavra minhaContagem = new ContagemPalavra();

    minhaContagem.adicionarPalavra("a", 1);
    minhaContagem.adicionarPalavra("b", 1);
    minhaContagem.adicionarPalavra("c", 2);

    minhaContagem.exibirContagemPalavras();
    minhaContagem.removerPalavra("a");
    minhaContagem.exibirContagemPalavras();

    System.out.println(minhaContagem.encontrarPalavrasMaisFrequente());

  }  

}
