package aula;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		//biblioteca de entrada 
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		//declaração de variáveis
		int numero1, numero2, resultado;
		//entrada de dados
		System.out.println("Digite o primeiro valor:\n");
		//leitura de variavel
		numero1 = sc.nextInt();
		//entrada de dados
		System.out.println("Digite o segundo valor:\n");
		//leitura de variavel
		numero2 = sc.nextInt();
		//calculo da soma
		resultado=numero1+numero2;
		System.out.println(numero1 + "+" + numero2 + "=" + resultado);
		

	}

}
