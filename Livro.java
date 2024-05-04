package aulas;

public class Livro {
   private String titulo;
   private String autor;
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static void main(String[] args) {
		
		Livro Romance = new Livro();
		Livro Aventura = new Livro();
		
  Romance.setTitulo("Como eu era antes de você");
  Romance.setAutor("Fulano de tal");
  Aventura.setTitulo("Hobbit");
  Aventura.setAutor("J.R.R. Tolkien");
  
  System.out.println("Romance - Titulo: "+ Romance.getTitulo());
  System.out.println("Romance - Autor: "+ Romance.getAutor());
  System.out.println("Aventura - Titulo: "+ Aventura.getTitulo());
  System.out.println("Aventura - Autor: "+ Aventura.getAutor());

	}

}
