package br.com.douglas.desafioAluraJava002.model;

public class Preferidas {
	public void inclui(Audio audio) {
		if (audio.getClassificacao() > 8) {
			System.out.println(audio.getTitulo() + " é considerado um sucesso!");
		} else {
			System.out.println(audio.getTitulo() + " também é bom!");
		}
	}
}
