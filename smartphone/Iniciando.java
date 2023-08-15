package smartphone;

public class Iniciando {

    public static void main(String[] args) {
        Iphone iphone= new Iphone();


        //Funcoes de internet
        System.out.println(iphone.adicionarNovaAba());
        System.out.println(iphone.atualizarPagina());
        System.out.println(iphone.exibirPagina());

        //Funcoes de mp3
        System.out.println(iphone.tocar());
        System.out.println(iphone.pausar());
        System.out.println(iphone.selecionarMusica("Metallica Album"));

        //Funcoes telefonicas
        System.out.println(iphone.ligar());
        System.out.println(iphone.atender());
        System.out.println(iphone.inciarCorreioDeVoz());
    }
}
