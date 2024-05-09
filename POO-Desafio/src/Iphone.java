import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música");
    }

    @Override
    public void tocarMusica() {
        System.out.println("tocando a música");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void selecionarCorreioVoz() {
        System.out.println("Selecionando o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

}
