package aulas;

public class aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double nota1= 6;
	      double nota2=7;
	      double media;
	      
	      media = (nota1+nota2)/2;
	      //Condição Composta
	      if (media >=7)
	    	  System.out.println("Aluno APROVADO!!!:"+media);
	      else if (media>=5 && media<7)
	    	  System.out.println("Aluno EM RECUPERAÇAO!!"+media);
	      else
	    	  System.out.println("Aluno REPROVADO!!:"+media);
	}

}
