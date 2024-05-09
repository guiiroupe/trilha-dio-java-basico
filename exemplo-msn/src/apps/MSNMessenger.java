package apps;
public class MSNMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN");	
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
}
