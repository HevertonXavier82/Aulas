package aulas;
import java.util.Scanner;

public class Lampada {
	private boolean ligada;
	private double pontencia;
	
	public Lampada() {
		// TODO Auto-generated constructor stub
		ligada = false;	
	}
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	public boolean estarLigada() {
		return ligada;
	}
	
	public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Lampada l = new Lampada();
			int opcao = 0;
			do
		{
			System.out.println ("0) Sair, 1) Ligar, 2) Desligar, 3) Mostrar ");
			System.out.println ("Digite a opção: "); opcao = sc.nextInt();
			switch(opcao) {
				case 1: l.ligar();
				System.out.println ("Ligada");
				break;
				case 2: l.desligar();
				System.out.println ("Desligada");
				break;
				case 3:
					if (l.estarLigada())
						System.out.println("Ligada");
					else
						System.out.println ("Desligada");
					break;
			}
		} while (opcao!=0);
		System.out.println ("Fim do Programa!");
	}
  }
}
