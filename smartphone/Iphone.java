package smartphone;

import smartphone.internet.NavegadorInternet;
import smartphone.reprodutor.ReprodutorMusical;
import smartphone.telefonico.AparelhoTenefonico;

public class Iphone implements AparelhoTenefonico, ReprodutorMusical, NavegadorInternet {



    @Override
    public String exibirPagina() {
        return "Exibindo Pagina";
    }

    @Override
    public String adicionarNovaAba() {
        return "ADICIONANDO NOVA ABA";
    }

    @Override
    public String atualizarPagina() {
        return "ATUALIZANDO";
    }

    @Override
    public String tocar() {
        return "TOCANDO";
    }

    @Override
    public String pausar() {
        return "PAUSADO";
    }

    @Override
    public String selecionarMusica(String nomeMusica) {
        return "Tocando a musica: "+ nomeMusica;
    }

    @Override
    public String ligar() {
        return "LIGANDO";
    }

    @Override
    public String atender() {
        return "ATENDENDO";
    }

    @Override
    public String inciarCorreioDeVoz() {
        return "INICIANDO CORREIO DE VOZ";
    }
}
