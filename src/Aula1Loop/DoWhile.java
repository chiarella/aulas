package Aula1Loop;

public class DoWhile {
	
	public static void main(String[] args) {
		
		/*
		 * Express�o que tem o mesmo "resultado" do While 
		 * diferen�a � que a esta ap�s o incremento
		 * 
		 * Utilizado quando o corpo da repeti��o precisa
		 * ser executado apenasuma vez
		 * 
		 * Exemplo: Processamento de entrada de um programa
		 * 
		 */
				
		int contador = 1;

        do {
        	System.out.println( "contador:" +  contador );
        	
        	//executou
           contador += 1;
           
        } while( contador < 5 );

        
		System.out.println("ACABOU  A REPETI��O - DO WHILE");
        System.out.println("Valor final do contator: " + contador);
		
	}

}
