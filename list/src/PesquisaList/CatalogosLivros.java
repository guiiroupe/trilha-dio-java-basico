package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {
  private List<Livro> livroList;

  public CatalogosLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for(Livro l : livroList){
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()){
      for(Livro l : livroList){
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for(Livro l : livroList){
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogosLivros meuCatalogo = new CatalogosLivros();
    
    meuCatalogo.adicionarLivro("Titulo1", "Autor1.1", 2020);
    meuCatalogo.adicionarLivro("Titulo2", "Autor2", 2021);
    meuCatalogo.adicionarLivro("Titulo1", "Autor1", 2020);
    meuCatalogo.adicionarLivro("Titulo4", "Autor2", 2023);

    System.out.println(meuCatalogo.pesquisarPorAutor("Autor1.1"));
    System.out.println(meuCatalogo.pesquisarPorTitulo("Titulo1"));
    System.out.println(meuCatalogo.pesquisarPorIntervaloAnos(2021, 2023));
  }
  
}
