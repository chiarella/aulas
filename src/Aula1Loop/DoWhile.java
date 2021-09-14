package Aula1Loop;

public class DoWhile {
	
	public static void main(String[] args) {
		
		/*
		 * Expressão que tem o mesmo "resultado" do While 
		 * diferença é que a esta após o incremento
		 * 
		 * Utilizado quando o corpo da repetição precisa
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

        
		System.out.println("ACABOU  A REPETIÇÃO - DO WHILE");
        System.out.println("Valor final do contator: " + contador);
		
	}

}
