package main;

import model.Cliente;
import notificacao.Notificador;
import notificacao.NotificadorSMS;
import service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {

		Cliente joao = new Cliente("João", "joao@xyz.com", "349998888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "988889999");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
