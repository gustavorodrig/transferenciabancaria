package br.com.transferenciabancaria.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.transferenciabancaria.modelo.Agendamento;


public class AgendamentoDAO {

	private static Map<Long, Agendamento> AGENDAMENTOS = new HashMap<Long, Agendamento>();
	private static AtomicLong contador = new AtomicLong(1);
	
	public void adiciona(Agendamento agendamento) {
		long id = contador.incrementAndGet();
		agendamento.setId(id);
		AGENDAMENTOS.put(id, agendamento);
	}
	
	public Collection<Agendamento> buscaTodosAgendamentos() {
		
		List<Agendamento> lista = new ArrayList<>();		
		for (Agendamento ag : AGENDAMENTOS.values()) {
				lista.add(ag);
		}
		return lista;
	}

	
}
