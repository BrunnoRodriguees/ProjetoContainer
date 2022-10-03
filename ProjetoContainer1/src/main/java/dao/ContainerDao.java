package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Container;

public class ContainerDao {

	private String sql = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection c;
	public boolean insertContainer(Container container) {
		sql = "INSERT INTO Container (cliente, numContainer, tipo, statusContainer,categoria) VALUES(?, ?, ?, ?, ?)";
	try {
		Conexao conexao = new Conexao();
		c = conexao.conectaBD();
		
		if(conexao.conectaBD() == null) {
			
		}else {
			System.out.println("Conectado com sucesso (CDAO)");
		}
	
		ps = c.prepareStatement(sql);
		ps.setInt(1, container.getCliente());
		ps.setInt(2, container.getNumContainer());
		ps.setString(3, container.getTipo());
		ps.setString(4, container.getStatusContainer());
		ps.setString(5, container.getCategoria());
		ps.execute();
		return true;
	}catch(SQLException Erro) {
		System.out.println("Erro ao inserir C");
	}
	return false;
	
	}
public ResultSet getRs() {
	return rs;
}
public void setRs(ResultSet rs) {
	this.rs = rs;
}
}
