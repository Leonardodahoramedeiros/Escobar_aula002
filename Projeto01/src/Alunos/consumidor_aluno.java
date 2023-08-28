package Alunos;

public class consumidor_aluno {

	public static void main(String[] args) {
		Alunos a = new Alunos("Leonardo", 123);
		Alunos a2 = new Alunos("Pri", 222);
		Alunos a3 = new Alunos("Sergio", 333);
		Alunos a4 = new Alunos("Josiane", 444);
		
		Turma turma1 = new Turma("Turma A");
		turma1.adicionarAlunos(a);
		turma1.adicionarAlunos(a2);
		
		Turma turma2 = new Turma("Turma b");
		turma2.adicionarAlunos(a3);
		turma2.adicionarAlunos(a4);
		
		turma1.ListarAlunos();
		turma2.ListarAlunos();
	}

}
