public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("12567779301", "Marcos");

		marcos.setEndereco("RUA DAS MARIAS");

		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}

