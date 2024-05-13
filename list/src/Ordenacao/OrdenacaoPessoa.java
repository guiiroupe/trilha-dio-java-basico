package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    //Comparação via comparable, lembre-se que implementamos a interface na classe pessoa.
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    //Ordenando via comparator, lembre-se que implementamos a classe ComparatorPorAltura
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  @Override
  public String toString() {
    return "OrdenacaoPessoa [pessoaList=" + pessoaList + "]";
  }

  public static void main(String[] args) {
    OrdenacaoPessoa minhaOrdenacaoPessoa = new OrdenacaoPessoa();

    minhaOrdenacaoPessoa.adicionarPessoa("Nome1", 12, 1.70);
    minhaOrdenacaoPessoa.adicionarPessoa("Nome2", 14, 1.74);
    minhaOrdenacaoPessoa.adicionarPessoa("Nome3", 19, 1.80);
    minhaOrdenacaoPessoa.adicionarPessoa("Nome4", 10, 1.40);

    System.out.println(minhaOrdenacaoPessoa.pessoaList);

    System.out.println(minhaOrdenacaoPessoa.ordenarPorAltura());
    System.out.println(minhaOrdenacaoPessoa.ordenarPorIdade());
  }
  
}
