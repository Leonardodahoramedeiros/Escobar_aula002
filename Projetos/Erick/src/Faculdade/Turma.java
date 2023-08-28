package Faculdade;

import java.util.ArrayList;


public class Turma {
	
	//public int codigo;
	Professor professor;
	public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public ArrayList<String> mostrar_alunos(){
		ArrayList<String> nomes = new ArrayList<String>();
		for (int i=0; i<this.alunos.size(); i++) {
			nomes.add(this.alunos.get(i).nome);
		}
		return nomes;
		
	}

}
