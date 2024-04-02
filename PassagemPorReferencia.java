package segunda;

public class PassagemPorReferencia {

	public PassagemPorReferencia() {
		// TODO Auto-generated constructor stub
	}
          //Passagem Por Referencia
public static void AlteraValor(StringBuilder frase) {
		frase.append("mundo!");
  System.out.println("Valor dentro do metodo: "+frase);
	}
	public static void main(String[] args) {
	StringBuilder texto = new StringBuilder("Ola ");
	System.out.println("Antes do metodo: "+texto);
	AlteraValor(texto);
	System.out.println("Depois do metodo: "+texto);
	

	}

}
