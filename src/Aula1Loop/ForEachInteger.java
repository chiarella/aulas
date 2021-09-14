package Aula1Loop;

import java.util.ArrayList;

public class ForEachInteger {

	public static void main(String[] args) {

		System.out.println("MOSTRANDO A LISTA DE NUMEROS:");

		// Declarando uma lista de numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);

		/*
		 * Percorrendo e "printando" no console uma lista através do: metodo .forEach
		 * lambda -> sysout passando n
		 * 
		 */

		for (int numero : numeros) {

						
			System.out.println(numero);

		}
		

	}

}
