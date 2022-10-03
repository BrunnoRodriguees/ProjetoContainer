package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Movimentacao;

public class MovimentacaoDao {
	
	private String sql;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection c;
	private Conexao conexao = null;
	public boolean insertMovimentacao(Movimentacao movimentacao) {
		String sql = "INSERT INTO Movimentacao (tipoMovimentacao, dataInicio, dataFim)(?, ?, ?)";
		try {
			conexao = new Conexao ();
			c = conexao.conectaBD();
			
			if(conexao.conectaBD() == null) {
		}else {
			System.out.println("Erro ao conectar (MDAO)");
		}
		ps = c.prepareStatement(sql);
		ps.setString(1, movimentacao.getTipo());
		ps.setDate(2, (Date) movimentacao.getDataInicio());
		ps.setDate(3,(Date) movimentacao.getDataFim());
		ps.execute();
		return true;
	}catch(SQLException Erro) {
		System.out.println("Erro ao inserir ");
	}
return false;

}
public ResultSet getRs() {
	return rs;
}
}
