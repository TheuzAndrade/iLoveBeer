package model;


import javax.persistence.Entity;


@Entity

public class Cliente extends Pessoa {

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}
