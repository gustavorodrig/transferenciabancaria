package br.com.transferenciabancaria.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.transferenciabancaria.calculo.ITaxa;
import br.com.transferenciabancaria.calculo.TipoTaxa;
import br.com.transferenciabancaria.dao.AgendamentoDAO;
import br.com.transferenciabancaria.modelo.Agendamento;

@Controller
public class AgendamentoController {

		
	@RequestMapping(value = "/")
	public ModelAndView formulario(String mensagem) {
		ModelAndView model = new ModelAndView("agendamento", "command", new Agendamento());
		model.addObject("tipoDeTaxas", TipoTaxa.values());
		model.addObject("mensagem", mensagem);
		return model;
	}

	@RequestMapping(value = "/adiciona", method = RequestMethod.POST)
	public ModelAndView adicionarAgendamento(@ModelAttribute Agendamento agendamento, BindingResult result) {

		//Se houver um erro no cadastro retorna a pagina de cadastro
		if(result.hasErrors())
			return formulario("Erro no preenchimento do formulário!");
		
		TipoTaxa tipoTaxa = agendamento.getTipoTaxa();
		ITaxa taxa = tipoTaxa.getTaxa();
		BigDecimal valorTaxa = taxa.calculaTaxa(agendamento);
		agendamento.setTaxa(valorTaxa);
		new AgendamentoDAO().adiciona(agendamento);

		return formulario("Agendamento Efetuado com sucesso!");
	}

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public String listarClientes(ModelMap model) {
		List<Agendamento> agendamentos = (List<Agendamento>) new AgendamentoDAO().buscaTodosAgendamentos();
		model.addAttribute("agendamentos", agendamentos);
		return "listaAgendamentos";
	}

}
