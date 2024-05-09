package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

  @Override
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando Mensagem pelo Facebook");
  }

  @Override
  public void receberMensagem() {
    validarConectadoInternet();
    System.out.println("Recebendo mensagem pelo Facebook");
  }

}
