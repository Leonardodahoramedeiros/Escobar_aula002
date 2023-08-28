package Biblioteca;

public class consumidor_livros {
	
	public static void main(String[] args) {
		
		//Livro livro = new Livro();
		Estante estante = new Estante();
		Livro livro;
		livro = new Livro();

		
		livro.titulo = "Bíblia";
		livro.autor = "Diversos";
		livro.ano = 0;
		
		estante.livros.add(livro);
		
		livro = new Livro();
		
		livro.titulo = "Alcorão";
		livro.autor = "Diversos";
		livro.ano = 0;
		
		estante.livros.add(livro);
		
		livro = new Livro();
		
		livro.titulo = "Torá";
		livro.autor = "Diversos";
		livro.ano = 0;
		
		estante.livros.add(livro);
		
		
		for(int i = 0 ;i < estante.livros.size();i++) {
			System.out.println(estante.livros.get(i).titulo);
			System.out.println(estante.livros.get(i).autor);
			System.out.println(estante.livros.get(i).ano);
		}
	}
}
