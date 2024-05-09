package apps;

public class Telegram extends ServicoMensagemInstantanea {

  @Override
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando Mensagem pelo Telegram");    
  }

  @Override
  public void receberMensagem() {
    validarConectadoInternet();
    System.out.println("Recebendo mensagem pelo Telegram");    
  }
  
}
