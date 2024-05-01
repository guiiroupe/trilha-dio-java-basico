public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Qual o volume? " +smartTv.volume);
        System.out.println("Qual o canal? " +smartTv.canal);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.escolherCanal(8);
    }
}
