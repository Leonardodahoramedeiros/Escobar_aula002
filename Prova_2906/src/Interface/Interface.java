package Interface;

import java.sql.SQLException;

import Classes.ProdutoAltoValor;

public class Interface {

	public static void main(String[] args) throws SQLException {
		
		ProdutoAltoValor prod = new ProdutoAltoValor();
		
		prod.codigo = 1;
		prod.nome = "Porsche";
		prod.precoSugerido = 500000;
		prod.custoArmazenamento = 1000;
		prod.tipoTransporte = "Guincho";
		prod.valorSeguro = 1500;

		System.out.println(prod.delete(1));
		
		System.out.println(prod.calcularPrecoTotal());
			

	}


	}


