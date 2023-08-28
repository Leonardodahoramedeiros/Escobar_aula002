package polimorfismo;

import java.util.ArrayList;

public class consumidor_intercursos {

	public static void main(String[] args) {
		ArrayList<intercurso> cursos = new ArrayList<intercurso>();
		//instanciar um bacharelado
		bacharelado BSI = new bacharelado();
		BSI.nome_curso="BSI";
		BSI.carga_horaria=3600;
		BSI.valor_parcela=800;
		//instanciar um bacharelado com laboratorio
		bacharelado_laboratorio ODONTO = new bacharelado_laboratorio();
		ODONTO.nome_curso="Odonto";
		ODONTO.carga_horaria=4000;
		ODONTO.valor_parcela=500;
		ODONTO.curso_lab=1000;
		
		bacharelado_laboratorio VETETINARIA = new bacharelado_laboratorio();
		
		VETETINARIA.nome_curso="VET";
		VETETINARIA.carga_horaria=3800;
		VETETINARIA.valor_parcela=2500;
		VETETINARIA.curso_lab=800;
		
		//adicionar um curso na lista bacharelado
		
		//BSI.salvar();
		//ODONTO.salvar();
		//adicionar um curso na lista_bacharelado
		cursos.add(BSI);
		cursos.add(ODONTO);
		cursos.add(VETETINARIA);
		
		//System.out.println(cursos.size());
		//for(int i=0;i<cursos.size();i++) {
			//System.out.println(cursos.get(i).GetNome_do_curso());
		//}
		
		estudante est = new estudante();
		est.cpf="111";
		est.email="leo@leo";
		est.nome="Leonardo";
		est.matricula="555978";
		est.cursos=cursos;
		
		
		System.out.println(est.calculoMensalidade());
		

	}

}
