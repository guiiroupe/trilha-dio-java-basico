/**
* <h1>Contador</h1>
* A classe Contador foi criada com o intuito de simular a contagem da diferença entre o segundo parâmetro e o segundo
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos
*
* @author  Guilherme Roupe
* @version 1.0
* @since   06/05/2024
*/

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();        
        try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();            
        }else{
            int contagem = parametroDois - parametroUm;
            System.out.println("Iniciando a contagem: ");
            for(int variavelTemporaria = 1; variavelTemporaria <= contagem; variavelTemporaria++){
                System.out.println("Imprimindo o número " + variavelTemporaria);
            }
            System.out.println("Contagem finalizada com sucesso!");
        }
	}
}
