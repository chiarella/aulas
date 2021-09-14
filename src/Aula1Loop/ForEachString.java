package Aula1Loop;

import java.util.ArrayList;

public class ForEachString {

	public static void main(String[] args) {

		// Declarando uma lista de texto
		ArrayList<String> linguagens = new ArrayList<>();
	
		linguagens.add("JAVA");
		linguagens.add(".NET");
		linguagens.add("PYTHON");

		System.out.println("MOSTRANDO A LISTA DE LINGUAGENS:");
		System.out.println("");

		// Aplicaçao do forEach percorrendo a lista
		for (String linguagem : linguagens) {

			// Visualizando a lista no console
			System.out.println(linguagem);

		}

	}
}