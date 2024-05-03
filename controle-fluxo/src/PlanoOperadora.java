public class PlanoOperadora {
  public static void main(String[] args) {
    /*Plano Básico = somente 100 min de ligação
     * Plano Mídia = 100 min de ligação e Whatsapp e Instagram grátis
     * Plano Turbo = 100 min de ligação, Whatsapp e Instagram grátis e 5Gb para o Youtube
    */

    String plano = "M";

    //Repare que nesse switch invertemos a ordem de grandeza e não colocamos o break, justamente, para que o plano mais completo possa pegar todas as mensagens
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
    }
  }
}
