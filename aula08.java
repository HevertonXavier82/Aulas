package aulas;

public class aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Estrutura:  DO WHILE
		int numero =1;
		int cont = 0;
		
		
		do {
		//System.out.println("numero: "+ numero);
		numero++; 
		if (numero % 2 == 0) {
			cont++;
			System.out.println("números pares: "+ numero);
		}
		}while(numero < 11);
		System.out.println("Total de números pares: "+ cont);
	}

}
