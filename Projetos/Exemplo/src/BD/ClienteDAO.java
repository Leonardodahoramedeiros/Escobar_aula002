package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classes.Cliente;

public class ClienteDAO {
	
	public static Cliente find_one(int cpf) {
		Connection conn = Banco_de_dados.getInstancia().getConnection();
		String query = "SELECT * FROM clientes WHERE cpf = ?";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cliente cliente = null;
		
		try {
			stmt=conn.prepareStatement(query);
			stmt.setInt(1, cpf);
			rs=stmt.executeQuery();
			if(rs.next()) {
				int id =rs.getInt("id");
				String nome = rs.getNString("nome");
				String telefone = rs.getNString("Telefone");
				cliente = new Cliente(id, nome, cpf, telefone);
				
			}
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return cliente;
	}
}
