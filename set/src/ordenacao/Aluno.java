package ordenacao;

public class Aluno implements Comparable<Aluno>{
  private String nome;
  private int matricula;
  private double nota;
  
  public Aluno(String nome, int matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + matricula;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
      return false;
    return true;
  }

  @Override
  public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
  }
  
}
