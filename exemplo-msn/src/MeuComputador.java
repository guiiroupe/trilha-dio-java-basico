import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class MeuComputador {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ServicoMensagemInstantanea smi = null;
	System.out.println("Qual serviço você deseja utilizar?");
	String escolheServico = scanner.next();

	if (escolheServico.equals("msn")) {
		smi = new MSNMessenger();
	}else if (escolheServico.equals("face")) {
		smi = new FacebookMessenger();
	}else if (escolheServico.equals("telegram")) {
		smi = new Telegram();
	}

	smi.enviarMensagem();
	smi.receberMensagem();
	scanner.close();
	}
}
