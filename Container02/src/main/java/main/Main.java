package main;

import container.Container;
import container.Movimentacao;
import dao.ContainerDao;
import dao.MovimentacaoDao;

public class Main {

	
		
		public static void main (String[] args) {
			
			
			 Movimentacao movimentacao = new Movimentacao();
			 MovimentacaoDao movimentacaoDao = new MovimentacaoDao();
			 movimentacao.getTipoMovimentacao();
			 movimentacao.getDataInicio();
			 movimentacao.getDataFim();
		
			movimentacaoDao.insertMovimentacao(movimentacao);
			
			System.out.println("Movimentacao Inserido com sucesso");
			 
			Container container = new Container();
			ContainerDao ContainerDao = new ContainerDao();
			container.setCliente(0);
			container.setNumContainer(0);
			container.setStatusContainer(null);
			container.setTipo(null);
			container.setCategoria(null);
			 
			ContainerDao.insertContainer(container);
			
			System.out.println("Container Inserido com sucesso");

		}
	
	
	}


