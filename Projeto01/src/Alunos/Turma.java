package Alunos;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String NomeTurma;
	private List<Alunos> alunos;
	
	public Turma(String NomeTurma) {
		this.NomeTurma=NomeTurma;
		this.alunos = new ArrayList<>();
	}
	
	public void adicionarAlunos(Alunos aluno) {
		alunos.add(aluno);
	}
	public void ListarAlunos() {
		System.out.println("Alunos da Turma " + NomeTurma + ":");
        for (Alunos aluno : alunos) {
            System.out.println("Nome: " + aluno.Nome);
            System.out.println("RGM: " + aluno.RGM);
          
	}
        
  }
	
}
