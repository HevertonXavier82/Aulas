package segunda;

public class MinhaClasse {

	private int numero;
	private String texto;
    
	private void setNumero(int numero) {
		this.numero = numero;
	}
	private void setTexto(String texto) {
		this.texto =texto;
	}
	
      private int getNumero() {
    	  return numero; 
      }
      
      private String getTexto() {
    	  return texto;
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MinhaClasse classe = new MinhaClasse();
        classe.setNumero(1);
        classe.setTexto("ESBAM");
        System.out.println("NUMERO:" + classe.getNumero());
        System.out.println("TEXTO:" + classe.getTexto());
		
		
	}

}
