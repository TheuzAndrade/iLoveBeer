package model;


import javax.persistence.Entity;


@Entity

public class Fornecedor extends Pessoa {
	
	private String CNPJ;


	public String getCnpj() {
		return CNPJ;
	}

	public void setCnpj(String cnpj) {
		this.CNPJ = cnpj;
	}
}
