package Solid_aula2;

public class teste_pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cartao_credito cc = new cartao_credito();
		venda v = new venda();
		
		cc.nome="Pedro de lara";
		cc.numero="1234";
		cc.data_validade="08/2030";
		cc.ValorCobrado = 10100;
		if(v.Processar_pagamento(cc)) {
			System.out.println("Compra cc confirmada");
		}else {
			System.out.println("Compra cc recusada");
		}	
		
		cartao_senff cs = new cartao_senff();
		cs.nome="Pedro de lara";
		cs.numero="12345";
		cs.data_validade="08/2030";
		cs.ValorCobrado = 100;
		
		if(v.Processar_pagamento(cs)) {
			System.out.println("Compra cs confirmada");
		}else {
			System.out.println("Compra cs recusada");
		}	
		
		boleto b = new boleto();
		b.nome="Pedro de lara";
		b.nosso_numero="1234";
		b.data_vencimento="08/2030";
		b.valor= 100;
		
		if(v.Processar_pagamento(b)) {
			System.out.println("Compra boleto confirmada");
		}else {
			System.out.println("Compra boleto recusada");
		}	
		
	}

}
