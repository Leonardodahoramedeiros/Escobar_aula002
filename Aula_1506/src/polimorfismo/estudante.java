package polimorfismo;

import java.util.ArrayList;

public class estudante {
	
	String matricula;
	String nome;
	String cpf;
	String email;
	
	ArrayList<intercurso> cursos = new ArrayList<intercurso>();
	
	public double calculoMensalidade() {
		double valor = 0;
		for(int i=0;i<this.cursos.size();i ++) {
			
			valor += this.cursos.get(i).GetCusto_do_Curso();
		}
		
		return valor;
	}
}
