package br.com.douglas.desafioAluraJava002.main;

import br.com.douglas.desafioAluraJava002.model.Musica;
import br.com.douglas.desafioAluraJava002.model.Podcast;
import br.com.douglas.desafioAluraJava002.model.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Pontes Indestrutiveis");
        musica.setCantor("Charlie Brow Jr.");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Flow");
        podcast.setApresentador("Igor");

        for (int i = 0; i < 15000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 3000; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}