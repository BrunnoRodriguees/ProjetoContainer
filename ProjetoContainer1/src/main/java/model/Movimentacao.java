package model;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Movimentacao {
	
	private String tipo;
	private Date dataInicio;
	private Data dataFim;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Data getDataFim() {
		return dataFim;
	}
	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}
	

}
