package aulas;
import java.util.*;
public class aula12 {

	public static void main(String[] args) {
		// declaração de variaveis
		char genero;
		//leitura da variavel pelo teclado
		Scanner ler= new Scanner (System.in);
		//Exibir mensagem na tela
		System.out.println("Digite o genero: M = masculino e F = feminino");
		//leitura da variavel genero pelo teclado
		genero = ler.next().charAt(0);
		switch (genero) {
		case 'F','f': System.out.println("Genero Feminino!!!");
		break;
		case 'M','m': System.out.println("Genero Masculino!!!!");
		break;
		default: System.out.println("Opção Invalida! digite M= masculino ou F = feminino");
		}
     
	}

}
