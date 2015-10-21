package br.com.transferenciabancaria.taxa;

import java.math.BigDecimal;

import br.com.transferenciabancaria.calculo.ITaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class TaxaA implements ITaxa{

	/* Regra de Calculo
	   Opera��es do tipo A tem uma taxa de $2 mais 3% do valor da transfer�ncia
	*/
	@Override
	public BigDecimal calculaTaxa(Agendamento agendamento) {
		
		BigDecimal valorTaxaFixo = new BigDecimal("2.00");
		BigDecimal valorTransferencia = agendamento.getValorTransferencia().divide(new BigDecimal("100"));
		
		return (valorTransferencia.multiply(new BigDecimal("3"))).add(valorTaxaFixo);
	}

}
