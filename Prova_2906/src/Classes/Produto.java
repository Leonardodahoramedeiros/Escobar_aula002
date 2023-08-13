package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.Banco_de_dados;

public class Produto {
	
	public int codigo;
    public String nome;
    public double precoSugerido;
    public double custoArmazenamento;

    public boolean delete(int codigo) throws SQLException {
		
		Connection conn = Banco_de_dados.getInstancia().getConnection();
		if (conn.isValid(0))
			System.out.println("Conexão funcionando");

		String sql = "DELETE FROM Produto WHERE codigo = ?";
		PreparedStatement ps4 = conn.prepareStatement(sql);
		ps4.setInt(1, codigo);
		int linha_alterada = ps4.executeUpdate();
		if (linha_alterada > 0) {
			System.out.println("Produto deletado com sucesso");
		} else {
			System.out.println("Falha dado nao deletado");
		}

		ps4.executeUpdate();

		return true;
	}
    
    public double calcularPrecoTotal() {
    	
        return precoSugerido + custoArmazenamento;
    }
    
    


}
