package operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
  }

  public void removerPalavra(String palavra) {
    String palavraIgual = "a";
    for (String p : palavrasUnicasSet) {
      if (p == palavra) {
        palavraIgual = p;
      }
    }
    palavrasUnicasSet.remove(palavraIgual);
  }

  public void verificarPalavra(String palavra) {
    for (String p : palavrasUnicasSet) {
      if (p == palavra) {
        System.out.println("A palavra está contida no conjunto");
      }
    }
  }

  public void exibirPalavrasUnicas() {
    System.out.println(palavrasUnicasSet);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas meuConjunto = new ConjuntoPalavrasUnicas();

    meuConjunto.adicionarPalavra("a");
    meuConjunto.adicionarPalavra("b");
    meuConjunto.adicionarPalavra("c");
    meuConjunto.adicionarPalavra("a");
    meuConjunto.adicionarPalavra("d");

    meuConjunto.exibirPalavrasUnicas();

    meuConjunto.removerPalavra("b");
    meuConjunto.exibirPalavrasUnicas();

    meuConjunto.verificarPalavra("d");
  }

}
