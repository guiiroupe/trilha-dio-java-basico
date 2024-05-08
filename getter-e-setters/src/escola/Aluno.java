package escola;

public class Aluno {
	//Deixamos os atributos como privado
	private String nome;
	private int idade;

	//Métodos getter e setters
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}