package br.com.agendamentofinanceiro.test.calculotaxa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class CalculoTaxaTipoBTest {
	
	AgendamentoParaTeste agTeste = new AgendamentoParaTeste();
	
	@Test
	public void TestaCalculoTaxaBDiferencaDeDiasMenorOuIgualATrintaEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 30);

		TipoTaxa tipoTaxa = TipoTaxa.B;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa B com diferença de 30 ou menos dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("10.00")) == 0);

	}

	@Test
	public void TestaCalculoTaxaBDiferencaDeDiasMaiorQueTrintaEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 31);

		TipoTaxa tipoTaxa = TipoTaxa.B;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa B com diferença de 30 ou mais dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("8.00")) == 0);

	}
}
