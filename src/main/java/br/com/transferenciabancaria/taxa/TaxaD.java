package br.com.transferenciabancaria.taxa;

import java.math.BigDecimal;

import br.com.transferenciabancaria.calculo.ITaxa;
import br.com.transferenciabancaria.modelo.Agendamento;

public class TaxaD implements ITaxa {

	 /*
	   Operações do tipo D tem a taxa igual a A, B ou C dependendo do valor da
	   transferência. Valores até $25.000 seguem a taxação tipo A 
	   Valores de $25.001 até $120.000 seguem a taxação tipo B 
	   Valores maiores que $120.000 seguem a taxação tipo C
	 */
	@Override
	public BigDecimal calculaTaxa(Agendamento agendamento) {

		BigDecimal valorTransferencia = agendamento.getValorTransferencia();

		if (valorTransferencia.compareTo(new BigDecimal("25000.00")) <= 0)
			return new TaxaA().calculaTaxa(agendamento);
		else if (valorTransferencia.compareTo(new BigDecimal("25000.00")) > 0
				&& valorTransferencia.compareTo(new BigDecimal("120000.00")) <= 0)
			return new TaxaB().calculaTaxa(agendamento);
		else
			return new TaxaC().calculaTaxa(agendamento);

	}

}
