package br.com.alura.mymusics.principal;

import br.com.alura.mymusics.models.MinhasPreferidas;
import br.com.alura.mymusics.models.Musica;
import br.com.alura.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Lover");
        musica.setAlbum("Lover");
        musica.setArtista("Taylor Swift");
        musica.setGenero("Pop");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Fato sobre bananas");
        podcast.setHost("Gin Himura");
        podcast.setDescricao("Vamos falar sobre algo que é por muitos evitado, " +
                "bananas, de onde vieram, onde moram, quem veio primeiro a banana ou o coco.");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}