package br.com.transferenciabancaria.calculo;

import br.com.transferenciabancaria.taxa.TaxaA;
import br.com.transferenciabancaria.taxa.TaxaB;
import br.com.transferenciabancaria.taxa.TaxaC;
import br.com.transferenciabancaria.taxa.TaxaD;

public enum TipoTaxa {

	A(new TaxaA()), 
	B(new TaxaB()), 
	C(new TaxaC()), 
	D(new TaxaD());

	private ITaxa taxa;

	TipoTaxa(ITaxa taxa) {
		this.taxa = taxa;
	}

	public ITaxa getTaxa() {
		return taxa;
	}

}
