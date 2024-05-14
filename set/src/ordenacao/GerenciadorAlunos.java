package ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, int matricula, double media){
    alunoSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(int matricula){
    Aluno alunoParaRemover = null;
    if (!alunoSet.isEmpty()) {
      for(Aluno a : alunoSet){
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
        }
      }
      alunoSet.remove(alunoParaRemover);
    }else{
      System.out.println("Gerenciado vazio");
    }
  }

  public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
    return alunoPorNome;
  }

  public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
    alunoPorNota.addAll(alunoSet);
    return alunoPorNota;
  }

  public void exibirAlunos(){
    System.out.println(alunoSet);
  }

  public static void main(String[] args) {
    GerenciadorAlunos meuGerenciador = new GerenciadorAlunos();

    System.out.println(meuGerenciador.alunoSet);

    meuGerenciador.adicionarAluno("Aluno1", 1234, 5.4);
    meuGerenciador.adicionarAluno("Aluno2", 1134, 8.6);
    meuGerenciador.adicionarAluno("Aluno3", 1334, 6.4);

    meuGerenciador.exibirAlunos();

    meuGerenciador.removerAluno(1234);

    System.out.println(meuGerenciador.exibirAlunosPorNome());

    System.out.println(meuGerenciador.exibirAlunosPorNota());
  }
}

class ComparatorPorNota implements Comparator<Aluno>{

  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getNota(), a2.getNota());
  }
  
}
