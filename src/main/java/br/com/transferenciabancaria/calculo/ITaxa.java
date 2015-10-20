package br.com.transferenciabancaria.calculo;

import java.math.BigDecimal;

import br.com.transferenciabancaria.modelo.Agendamento;

public interface ITaxa {

	public BigDecimal calculaTaxa(Agendamento agendamento);

}
