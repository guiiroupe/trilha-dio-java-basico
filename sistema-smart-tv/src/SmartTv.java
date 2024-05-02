/**
* <h1>SmartTv</h1>
* A classe SmartTv foi criada com o intuito de simular um sistema de smartTV, ela realiza operações como alterar canal, aumentar volume e desligar/ligar
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos
*
* @author  Guilherme Roupe
* @version 1.0
* @since   01/05/2024
*/

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar(){
    ligada = true;
    System.out.println("Novo Status -> TV Ligada? " + ligada);
  }
  public void desligar(){
    ligada = false;
    System.out.println("Novo Status -> TV Ligada? " + ligada);
  }
  public void aumentarVolume(){
    volume++;
    System.out.println("Novo Status -> Volume: " + volume);
  }
  public void diminuirVolume(){
    volume--;
    System.out.println("Novo Status -> Volume: " + volume);
  }
  public void aumentarCanal(){
    canal++;
    System.out.println("Novo Status -> Canal: " + canal);
  }
  public void diminuirCanal(){
    canal--;
    System.out.println("Novo Status -> Canal: " + canal);
  }
  public void escolherCanal(int canalEscolhido){
    canal = canalEscolhido;
    System.out.println("Novo Status -> Canal: " + canal);
  }

}
