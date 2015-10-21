package br.com.transferenciabancaria.taxa;

import java.math.BigDecimal;

import br.com.transferenciabancaria.calculo.ITaxa;
import br.com.transferenciabancaria.modelo.Agendamento;


public class TaxaB implements ITaxa {

	 /*
	   Regra de Calculo 
	   $10 para pedidos com agendamento até 30 dias da data de cadastro 
	   $8 para os demais
	 */
	public BigDecimal calculaTaxa(Agendamento agendamento) {

		int dias = agendamento.quantidadeDiasCadastroTransferencia();

		if (dias <= 30)
			return new BigDecimal("10.00");
		else
			return new BigDecimal("8.00");

	}



}
