package Aula1Loop;

public class While {

	// M�todo main para executarmos nossa aplica��o.
	public static void main(String[] args) {

		/*
		 * While = loop = la�o (Estrutura de repeti��o)
		 * 
		 */

		int contador = 1;

		while (contador < 5) {

			// Mostrando na tela o valor do contador
			System.out.println("contador: " + contador);
			// Incremento, para pular de 1 em 1
			contador++;
		}

		System.out.println("ACABOU  A REPETI��O - WHILE");
        System.out.println("Valor final do contator: " + contador);


	}

}
