package faculdade;

public class consumidor_turma {

	public static void main(String[] args) {
		
		Aluno a;
		Professor prof = new Professor();
		Turma turma = new Turma();
		
		a = new Aluno();
		
		prof.Nome="Leonardo";
		prof.CPF="000";
		prof.Email="prof@prof";
		prof.Matricula="111";
		
		turma.professor= prof;
		
		a.Nome="Prisicilla";
		a.Email="PRI@PRI";
		a.Matricula="000";
		a.CPF="555";
		
		turma.aluno.add(a);
		
		System.out.println(turma.Consultar_nomes());
	
		
		

		
		
		
		

	}

}
