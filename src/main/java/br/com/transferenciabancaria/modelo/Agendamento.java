package br.com.transferenciabancaria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.transferenciabancaria.calculo.TipoTaxa;

@SuppressWarnings("serial")
public class Agendamento implements Serializable {

	private long id;
	private String contaOrigem;
	private String contaDestino;
	private BigDecimal valorTransferencia;
	private BigDecimal taxa;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro = new Date();

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataAgendada;

	private TipoTaxa tipoTaxa;

	public Agendamento(String contaOrigem, String contaDestino, BigDecimal valorTransferencia, BigDecimal taxa,
			Date dataCadastro, Date dataAgendada, TipoTaxa tipoTaxa) {
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valorTransferencia = valorTransferencia;
		this.taxa = taxa;
		this.dataCadastro = dataCadastro;
		this.dataAgendada = dataAgendada;
		this.tipoTaxa = tipoTaxa;
	}

	public Agendamento() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}

	public BigDecimal getValorTransferencia() {
		return valorTransferencia;
	}

	public void setValorTransferencia(BigDecimal valorTransferencia) {
		this.valorTransferencia = valorTransferencia;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public TipoTaxa getTipoTaxa() {
		return tipoTaxa;
	}

	public void setTipoTaxa(TipoTaxa tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(Date dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public int quantidadeDiasCadastroTransferencia() {
		return Days.daysBetween(new DateTime(this.dataCadastro), new DateTime(this.dataAgendada)).getDays();
	}

}
