package Solid_aula2;

public class venda {
	
	public double valor_a_cobrar; //atributo provisório
	public boolean Processar_pagamento(servico_financeiro f) {
		boolean resultado = false;
		if(f.pagar()){
				resultado = true;
			}else {
				resultado = false;
			}
		return resultado;
	}

}
