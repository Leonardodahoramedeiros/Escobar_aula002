package Faculdade;

import java.util.ArrayList;

public class Turma {
	
	Professor professor;
	
	public ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	
	public ArrayList<String> mostrar_alunos(){
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		for(int i = 0; i < this.aluno.size();i++){
			nomes.add(this.aluno.get(i).nome);
		
	}return nomes;	
  }
	
}
