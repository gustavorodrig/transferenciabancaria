package br.com.agendamentofinanceiro.test.calculotaxa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class CalculoTaxaTipoATest {

	AgendamentoParaTeste agTeste = new AgendamentoParaTeste();
	
	@Test
	public void TestaCalculoTaxaAEstaCorreto(){
		
		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 0);
		
		TipoTaxa tipoTaxa = TipoTaxa.A;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);		
		Assert.assertTrue("Transferencias com Tipo de Taxa A", valorTaxa.compareTo(new BigDecimal("5.00")) == 0);
		
	}
	
}
