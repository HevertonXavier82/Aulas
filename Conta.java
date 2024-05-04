package aulas;

public class Conta {
   private double saldo;
   private String nome;
	
   public Conta() {
		double saldo =0;
		String nome;
	}
    
	 public void deposita (double valor) {
		  this.saldo = this.saldo + valor;
	 }
	 
	 public double getSaldo() {
		  return this.saldo;
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getNome() {
		 return this.nome;
	 }
	
	public static void main(String[] args) {
	Conta conta01 = new Conta();
	Conta conta02 = new Conta();
	// Definir nome de ambas metodos setNome
	conta01.setNome("Mara da Silva");
	conta02.setNome("João da Silva");
	//Depositar valor
	conta01.deposita(1000);
	conta02.deposita(500);
	// Resultados
	System.out.println ("conta01 - Nome: " + conta01.getNome());
	System.out.println ("conta01 - Saldo: " + conta01.getSaldo());
	System.out.println ("conta02 - Nome: " + conta02.getNome());
	System.out.println ("conta02 - Saldo: " + conta02.getSaldo());

	}

}
