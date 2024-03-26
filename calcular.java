package segunda;

public class calcular {
   private double numero1;
   private double numero2;
	public calcular(double numero1,double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	   
	   public double somar() {
         return numero1 + numero2;
	   }
	   public double subtrair() {
		   return numero1-numero2;
	   }
	   
	   public double getNumero1() {
		   return numero1;
	   }
	   public double getNumero2() {
		   return numero2;
	   }
	   
	   public void setNumero1 (double numero1 ) {
		   this.numero1 = numero1;
	   }
	   public void setNumero2(double numero2) {
		   this.numero2 = numero2;
	   }

	public static void main(String[] args) {
		calcular calc = new calcular(10,5);
         System.out.println("SOMAR:"+calc.somar());
         System.out.println("SUBTRAIR:"+calc.subtrair());
	}

}
