package aulas;
import java.util.Scanner;
public class aula06 {

	public static void main(String[] args) {
		// Estrutura de Repetição: While
       Scanner ler = new Scanner(System.in);
       int numero,cont,acm;
       cont = 0;
       acm=0;
       System.out.println("Digite um numero (0 para sair):");
       numero = ler.nextInt();
		while (numero != 0) {
			if (numero != 0) {
				cont++; //cont = cont +1
				acm = acm + numero;
			}
			System.out.println("Você digitou:" + numero);
			System.out.println("Digite um numero (0 para sair):");
			numero = ler.nextInt();
			
		}
		System.out.println("Fim do programa!!!");
		System.out.println("TOTAL:" + cont);
		System.out.println("VALOR ACUMULADOR:" + acm );
	}
}
