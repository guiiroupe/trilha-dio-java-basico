import java.util.Locale;
import java.util.Scanner;

/**
* <h1>ContaTerminal</h1>
* A ContaTerminal foi criada com o intuito de simular o básico de um funcionamento de uma conta bancária
* <p>
*
* @author  Guilherme Roupe
* @version 1.0
* @since   03/05/2024
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        //Pessoalmente, achei que não faz sentido pedir o saldo para o cliente, no entanto deixei essa linha de código pois o enunciado do exercício pede para que os dados sejam enseridos via terminal.

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
