package Faculdade;

public class ConsumidorTurma {

	public static void main(String[] args) {
		
				Aluno a; 
				Turma turma = new Turma();
				Professor prof = new Professor();
				prof.cpf = "123";
				prof.email ="pedrinho@gmail.com";
				prof.matricula ="000";
				prof.nome ="Pedro de Lara";
				
				turma.professor = prof;
				
				a = new Aluno();
				a.cpf ="1235";
				a.email ="josinho@gmail.com";
				a.matricula ="001";
				a.nome ="Jose";
				
				turma.alunos.add(a);
				
				a = new Aluno();
				a.cpf ="1234";
				a.email ="mariazinha@gmail.com";
				a.matricula ="001";
				a.nome ="Maria";
				
				turma.alunos.add(a);
				
				a = new Aluno();
				a.cpf ="1234";
				a.email ="erickinho@gmail.com";
				a.matricula ="001";
				a.nome ="Erick";
				
				turma.alunos.add(a);
				
				System.out.println(turma.mostrar_alunos());
	
	}

}
