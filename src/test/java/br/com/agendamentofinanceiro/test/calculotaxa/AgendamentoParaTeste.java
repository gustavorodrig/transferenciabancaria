package br.com.agendamentofinanceiro.test.calculotaxa;

import java.math.BigDecimal;
import org.joda.time.DateTime;

import br.com.transferenciabancaria.modelo.Agendamento;

public class AgendamentoParaTeste {

	public Agendamento criaAgendamentoParaTesteDeTaxa(BigDecimal valorTransferencia, int diasEntreCadastroAgendamento) {
		
		DateTime dataAtual = new DateTime();
		DateTime dataAgendada = new DateTime();
		dataAgendada = dataAgendada.plusDays(diasEntreCadastroAgendamento);		
		
		Agendamento ag = new Agendamento();
		ag.setContaOrigem("12345-67");
		ag.setContaDestino("99999-11");
		ag.setDataCadastro(dataAtual.toDate());
		ag.setDataAgendada(dataAgendada.toDate());
		ag.setValorTransferencia(valorTransferencia);

		return ag;
	}

}
