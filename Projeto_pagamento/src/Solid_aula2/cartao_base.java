package Solid_aula2;

public abstract class cartao_base implements servico_financeiro {
	
	public String nome;
	public String numero;
	public String data_validade;
	public double ValorCobrado;
	
	
	public boolean Validar() {
		if(this.ValidadaData()
				&&this.ValidadaNome()&&
				this.ValidadaNumero()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	protected boolean ValidadaNome() {
		boolean resultado =false;
		//chamar o endpoint da api da operadora die cartão de credito 
		if (this.nome.equalsIgnoreCase("Pedro de lara")){
			resultado = true;
				
		}else {
			resultado = false;
		}
		return resultado;
	}
	protected boolean ValidadaNumero() {
		boolean resultado =false;
		
		if (this.numero.equalsIgnoreCase("1234")){
			resultado = true;
				
		}else {
			resultado = false;
		}
		return resultado;
	}
	protected boolean ValidadaData() {
		boolean resultado =false;
		
		if (this.data_validade.equalsIgnoreCase("08/2030")){
			resultado = true;
				
		}else {
			resultado = false;
		}
		return resultado;
	}	

}
