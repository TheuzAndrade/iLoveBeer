package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "pedido_id", sequenceName = "pedido_seq", allocationSize = 1)

public class Pedido extends AbstractEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_id")
	private Long id;
	private int itensPedidos;
	private float valorTotal;
//private Pagamento pagamento;
	
	@ManyToOne
	private Itens itens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(int itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
/*
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}*/

	public Itens getItens() {
		return itens;
	}

	public void setItens(Itens itens) {
		this.itens = itens;
	}
	
	
}
