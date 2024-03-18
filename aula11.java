package aulas;
import java.util.Scanner; //Biblioteca da leitura pelo teclado
public class aula11 {

	public static void main(String[] args) {
		// Declaração de variaveis
		double valorTotal;
		int codigo;
        double desconto =0;
        double valorFinal;
        //entrada de dados
        Scanner ler = new Scanner (System.in);
        
       System.out.println("Digite o valor total da compra:");
       valorTotal = ler.nextDouble();
       System.out.println("Digite o código do cliente: 1 - comum, 2-funcionário, 3 -vip");
       codigo = ler.nextInt();
       // Estrutura multipla seleção
       switch (codigo) {
       case 1: desconto =0;
       valorFinal =valorTotal - (valorTotal*desconto);
       System.out.println("Valor total R$" + valorFinal);
       
       break;
       case 2: desconto=0.1;
       valorFinal =valorTotal - (valorTotal*desconto);
       System.out.println("Valor total R$" + valorFinal);
       break;
       case 3: desconto=0.2;
       valorFinal =valorTotal - (valorTotal*desconto);
       System.out.println("Valor total R$" + valorFinal);
       break;
       default: System.out.println("Opção Inválida!! Digite novamente entre valor 1 e 3.");
            
       }
      //  valorFinal =valorTotal - (valorTotal*desconto);
        //Saida de dados
      //  System.out.println("Valor total R$" + valorFinal);
        
       
       
        
        
	}

}
