package main;

public class Controle {
	public static void PrintTexto(String input) {
		String[] palavras = input.split(";");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
