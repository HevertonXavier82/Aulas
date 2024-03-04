package aulas;
//chamada da Biblioteca de leitura pelo teclado
import java.util.Scanner;
public class aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cria a variavel de leitura 
      Scanner ler = new Scanner(System.in);
      float nota1,nota2,media;
      //entrada de dados
      System.out.print("Digite a primeira nota:\n");
      nota1 = ler.nextFloat();
      System.out.println("Digite a segunda nota:");
      nota2 = ler.nextFloat();
      //processamento:calculo aritmetico
      
      media = (nota1+nota2)/2;
      
      //saida de dados
      System.out.println("Média Final é:"+ media);
      
      
      
      
      
      
      
	}

}
