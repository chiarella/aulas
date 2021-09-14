package Aula1Loop;

public class While {

	// Método main para executarmos nossa aplicação.
	public static void main(String[] args) {

		/*
		 * While = loop = laço (Estrutura de repetição)
		 * 
		 */

		int contador = 1;

		while (contador < 5) {

			// Mostrando na tela o valor do contador
			System.out.println("contador: " + contador);
			// Incremento, para pular de 1 em 1
			contador++;
		}

		System.out.println("ACABOU  A REPETIÇÃO - WHILE");
        System.out.println("Valor final do contator: " + contador);


	}

}
