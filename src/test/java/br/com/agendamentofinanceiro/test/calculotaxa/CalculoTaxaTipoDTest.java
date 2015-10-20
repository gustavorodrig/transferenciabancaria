package br.com.agendamentofinanceiro.test.calculotaxa;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class CalculoTaxaTipoDTest {

	AgendamentoParaTeste agTeste = new AgendamentoParaTeste();

	@Test
	public void TestaCalculoTaxaDValorAteVinteECincoMil() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("25000.00"), 0);
		
		TipoTaxa tipoTaxa = TipoTaxa.D;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa D com valor ate 25.000",
				valorTaxa.compareTo(new BigDecimal("752.00")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaDValorMaiorQueVinteECincoMilEMenorQueCentoEVinteMil() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("50000.00"), 0);

		TipoTaxa tipoTaxa = TipoTaxa.D;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa D com valor maior que 25.000 e menor que 120.000",
				valorTaxa.compareTo(new BigDecimal("10.00")) == 0);

	}
	
	@Test
	public void TestaCalculoTaxaDValorMaiorQueCentoEVinteMil() {

		Agendamento ag = agTeste.criaAgendamentoParaTesteDeTaxa(new BigDecimal("125000.00"), 0);

		TipoTaxa tipoTaxa = TipoTaxa.D;
		BigDecimal valorTaxa = tipoTaxa.getTaxa().calculaTaxa(ag);
		Assert.assertTrue("Transferencias com Tipo de Taxa D com valor maior que 120.000",
				valorTaxa.compareTo(new BigDecimal("10375.00")) == 0);

	}
	
	
}
