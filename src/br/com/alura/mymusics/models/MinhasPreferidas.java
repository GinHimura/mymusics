package br.com.alura.mymusics.models;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println("%s é considerado sucesso absoluto e preferido por todos"
                    .formatted(audio.getTitulo()));
        } else {
            System.out.println("%s também é um dos que todo mundo está curtindo"
                    .formatted(audio.getTitulo()));
        }
    }
}
