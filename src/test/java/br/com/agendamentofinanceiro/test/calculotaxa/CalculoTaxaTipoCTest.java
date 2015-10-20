package br.com.agendamentofinanceiro.test.calculotaxa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class CalculoTaxaTipoCTest {

	AgendamentoParaTeste agTeste = new AgendamentoParaTeste();

	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasMenorOuIgualACincoEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 5);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 5 ou menos dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("8.30")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasDeSeisADezEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 10);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 6 a 10 dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("7.40")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasDeOnzeAQuinzeEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 15);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 11 a 15 dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("6.70")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasDeDezesseisAVinteEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 20);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 16 a 20 dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("5.40")) == 0);

	}
	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasDeVinteEUmAVinteECincoEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 25);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 21 a 25 dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("4.30")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaCDiferencaDeDiasDeVinteESeisATrintaEstaCorreto() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 30);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença de 26 a 30 dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("2.10")) == 0);

	}

	@Test
	public void TestaCalculoTaxaCDiferencaMaiorQueTrintaDias() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("100.00"), 31);

		TipoTaxa tipoTaxa = TipoTaxa.C;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa C com diferença maior que dias da data de Cadastro",
				valorTaxa.compareTo(new BigDecimal("1.20")) == 0);

	}

}
