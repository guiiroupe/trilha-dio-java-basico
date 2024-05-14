package pesquisa;

public class Tarefa {
  private String descricao;
  private boolean concluidaOuNao;
  
  public Tarefa(String descricao, boolean concluidaOuNao) {
    this.descricao = descricao;
    this.concluidaOuNao = concluidaOuNao;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isConcluidaOuNao() {
    return concluidaOuNao;
  }


  @Override
  public String toString() {
    return "Tarefa [descricao=" + descricao + ", concluidaOuNao=" + concluidaOuNao + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
    Tarefa other = (Tarefa) obj;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    return true;
  }

  public void setConcluidaOuNao(boolean concluidaOuNao) {
    this.concluidaOuNao = concluidaOuNao;
  }
  
}
