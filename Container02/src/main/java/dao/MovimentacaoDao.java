package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import container.Movimentacao;


public class MovimentacaoDao {

	private String sql = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection c;
	private Conexao conexao = null;
	
	public boolean insertMovimentacao(Movimentacao movimentacao) {
		sql = "INSERT INTO Movimentacao (tipoMovimentacao, dataInicio, dataFim) VALUES (?, ?, ?)";
				try {
					conexao = new Conexao ();
					 c = conexao.conectaBD();
					
					if(conexao.conectaBD() == null) {
						System.out.println("Erro ao conectar M (Dao)");
						
					}else {
						System.out.println("Conectado com sucesso! M (Dao)");
					}
					
					ps = c.prepareStatement(sql);
					ps.setString(1, movimentacao.getTipoMovimentacao()); 
					ps.setDate(2,(Date) movimentacao.getDataInicio());
					ps.setDate(3,(Date) movimentacao.getDataFim());
					ps.execute();
					return true;
				}catch(SQLException erro) {
						System.out.println("Erro ao inserir");
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


