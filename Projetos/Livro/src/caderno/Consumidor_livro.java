package caderno;

import java.util.ArrayList;

public class Consumidor_livro {

	public static void main(String[] args) {
		
		caderno_1 cad = new caderno_1();
		
		estante e;
		 e = new estante();
		
		cad.Titulo="Alcorão";
		cad.Autor="Diversos";
		cad.ano=0;
		e.estante="Bíblia";
		
		cad.livros.add(e);
		
		e = new estante();

		cad.Titulo="Bíblia";
		cad.Autor="Diversos";
		cad.ano=0;
		e.estante="Bíblia";
		
		cad.livros.add(e);
		
		 e = new estante();

		cad.Titulo="Torá";
		cad.Autor="Diversos";
		cad.ano=0;
		e.estante="Bíblia";
		
		cad.livros.add(e);
		
		
		for(int i =0;i < e.livros.size();i++) {
			System.out.println(e.livros.get(i).Titulo);
			
		}
		
		
		
		
		
		
			

	}

}
