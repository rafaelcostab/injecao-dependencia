package service;

import model.Cliente;
import model.Produto;
import notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	EmissaoNotaFiscalService(Notificador notificador){
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		//TODO emite nota fiscal aqui..
		
		this.notificador.notificar(cliente, "Nota fiscal do produto" 
				+ produto.getNome() + "foi emitida!");
	}
	
}
