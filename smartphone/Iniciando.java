package smartphone;

public class Iniciando {

    public static void main(String[] args) {
        Iphone iphone= new Iphone();


        //Funcoes de internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        //Funcoes de mp3
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Metallica Album");

        //Funcoes telefonicas
        iphone.ligar();
        System.out.println(iphone.atender());
        System.out.println(iphone.inciarCorreioDeVoz());
    }
}
