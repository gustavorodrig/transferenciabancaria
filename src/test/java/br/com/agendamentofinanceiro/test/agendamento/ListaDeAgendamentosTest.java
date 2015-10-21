package br.com.agendamentofinanceiro.test.agendamento;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.dao.AgendamentoDAO;
import br.com.transferenciabancaria.modelo.Agendamento;

public class ListaDeAgendamentosTest {

	Agendamento ag;
	AgendamentoDAO dao = new AgendamentoDAO();
	
	@Before
	public void CriarUmAgendamento(){
		
		ag = new Agendamento();
		ag.setContaOrigem("12345-67");
		ag.setContaDestino("99999-11");
		ag.setDataCadastro(new DateTime());
		ag.setDataAgendada(new DateTime());
		ag.setValorTransferencia(new BigDecimal("100.00"));
		ag.setTaxa(new BigDecimal("1.00"));
		ag.setTipoTaxa(TipoTaxa.A);
		
	}
	
	@Test
	public void DeveIncluirOAgendamentoEmUmaListaERetornarOIdGerado(){
		
		dao.adiciona(ag);
		Assert.assertFalse("Adicionado agendamento em uma Lista de Agendamentos Cadastrados", dao.buscaTodosAgendamentos().isEmpty());
		
		Long id = null;		
		for(Agendamento ag : dao.buscaTodosAgendamentos()){
			id = ag.getId();
			break;
		}
		Assert.assertNotNull("Agendamento tem Id", id);
		
	}
	
}
