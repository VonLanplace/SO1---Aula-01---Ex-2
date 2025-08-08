package main;

import javax.swing.JOptionPane;

public class Visão {
	public static void main(String[] args) {
		while (true) {
			String input = JOptionPane.showInputDialog("Insira o Texto.");
			if (input == null) {
				break;
			}
			Controle.PrintTexto(input);
		}
	}
}
