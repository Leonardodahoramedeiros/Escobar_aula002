package faculdade;

import java.util.ArrayList;

public class Turma {
	
	
	Professor professor;
	
	ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	
	ArrayList<String> Consultar_nomes(){
		
		ArrayList<String> nomes = new ArrayList<String>();
		for(int i = 0; i < this.aluno.size();i++) {
			nomes.add(this.aluno.get(i).Nome);	
			
		}return nomes;
	}

}
