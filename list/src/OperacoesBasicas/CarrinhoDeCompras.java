package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> listaItems;

  public CarrinhoDeCompras() {
    this.listaItems = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade){
    listaItems.add(new Item(nome, preco, quantidade));
}


  public void removerItem(String nome){
    List<Item> removerItemList = new ArrayList<>();
    for(Item i : listaItems){
      if (i.getNome().equalsIgnoreCase(nome)) {
        removerItemList.add(i);        
      }
    }
    listaItems.removeAll(removerItemList);
    
  }

  public double calcularValorTotal(){
    double valorTotal = 0;
    for(Item i : listaItems){
      valorTotal += i.getPreco() * i.getQuantidade();
    }
    return valorTotal;
  }

  public void exibirItens(){
    System.out.println(listaItems);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras meuCarrinhoDeCompras = new CarrinhoDeCompras();

    meuCarrinhoDeCompras.adicionarItem("geladeira", 500, 1);
    meuCarrinhoDeCompras.adicionarItem("Iphone", 5400.10, 2);

    meuCarrinhoDeCompras.exibirItens();

    double valorTotal = meuCarrinhoDeCompras.calcularValorTotal();
    System.out.println("Valor total: " + valorTotal);

    meuCarrinhoDeCompras.removerItem("geladeira");

    valorTotal = meuCarrinhoDeCompras.calcularValorTotal();
    System.out.println("Valor total após remoção: " + valorTotal);
  }
}
