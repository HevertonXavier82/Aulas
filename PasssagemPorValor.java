package segunda;

public class PasssagemPorValor {

	public PasssagemPorValor() {
		// TODO Auto-generated constructor stub
	}
        // Passagem parametro por valor
	
	public static void main(String[] args) {
		int num =10;
		System.out.println("Antes do metodo:"+num);
		Altera(num);
		System.out.println("Depois do metodo"+num);
	}
	public static void Altera(int numero) {
		numero=20;
System.out.println("Valor dentro do metodo"+numero);
	}
}
