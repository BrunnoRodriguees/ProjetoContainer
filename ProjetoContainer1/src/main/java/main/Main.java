package main;

import dao.ContainerDao;
import dao.MovimentacaoDao;
import model.Container;
import model.Movimentacao;

public class Main {

	public static void main(String[] args) {
		
		Movimentacao movimentacao = new Movimentacao();
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao();
		movimentacao.getTipo();
		movimentacao.getDataInicio();
		movimentacao.getDataFim();
		
		movimentacaoDao.insertMovimentacao(movimentacao);
		
		System.out.println("Movimentacao insirido com sucesso!");
		
		Container container = new Container();
		ContainerDao containerDao = new ContainerDao();
		container.setCliente(0);
		container.setNumContainer(0);
		container.setStatusContainer(null);
		container.setTipo(null);
		container.setCategoria(null);
		
		containerDao.insertContainer(container);
		
		System.out.println("Container inserido com sucesso!");

	}

}
