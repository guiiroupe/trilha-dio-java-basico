package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProduto() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque(){
    double somaValorTotal = 0;
    if (!estoqueProdutosMap.isEmpty()) {
      for(Produto p : estoqueProdutosMap.values()){
        somaValorTotal += p.getQuantidade() * p.getPreco();
      }
      return somaValorTotal;
    }else{
      return somaValorTotal;
    }
  }

  public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for(Produto p : estoqueProdutosMap.values()){
      if (p.getPreco() > maiorPreco) {
        maiorPreco = p.getPreco();
        produtoMaisCaro = p;
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato(){
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for(Produto p : estoqueProdutosMap.values()){
      if (p.getPreco() < menorPreco) {
        menorPreco = p.getPreco();
        produtoMaisBarato = p;
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
    Produto produtoMaiorQuantidade = null;
    int maiorQuantidade = Integer.MIN_VALUE;
    for(Produto p : estoqueProdutosMap.values()){
      if (p.getQuantidade() > maiorQuantidade) {
        maiorQuantidade = p.getQuantidade();
        produtoMaiorQuantidade = p;
      }
    }
    return produtoMaiorQuantidade;
  }

  public static void main(String[] args) {
    EstoqueProduto meuEstoque = new EstoqueProduto();

    meuEstoque.exibirProdutos();

    meuEstoque.adicionarProduto(1L, "a", 1, 10);
    meuEstoque.adicionarProduto(2L, "b", 1, 110);
    meuEstoque.adicionarProduto(3L, "c", 2, 120);
    meuEstoque.adicionarProduto(4L, "d", 1, 110);

    System.out.println(meuEstoque.calcularValorTotalEstoque());

    System.out.println(meuEstoque.obterProdutoMaisCaro());

    System.out.println(meuEstoque.obterProdutoMaisBarato());

    System.out.println(meuEstoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }
}
