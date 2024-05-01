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
