package aulas;

public class aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //declarar variaveis
		double saldo = 25.0;
		double valorSolicitado = 60;
		
		//Estrutura de Condição Simples
		if(valorSolicitado <  saldo)
			saldo = saldo - valorSolicitado;
		System.out.println("Valor Final:"+saldo);
		
	}

}
