package Aula1Loop;

import java.util.ArrayList;

public class MetodoBonus {

	/*
	 * A partir do Java 8
	 * 
	 * podemos utilizar o metodo .forEach com a expressão lambda
	 * aplicando um consumer, 
	 * precisamos criar uma variável "n"
	 * 
	 * Como parâmetro desse método adicionamos o consumer
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("MOSTRANDO A LISTA DE NUMEROS:");

		// Declarando uma lista de numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		System.out.println("INDEX 0: " + numeros.get(0));


		numeros.forEach((n) -> {
			System.out.println(n);
		});


	}

}
