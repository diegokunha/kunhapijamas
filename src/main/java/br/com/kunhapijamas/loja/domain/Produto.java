package br.com.kunhapijamas.loja.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Entity
public class Produto  implements Serializable{

	private static final long serialVersionUID = -6456431303077777175L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private long id;
	
	@Getter @Setter
	private String descricao;
	
	@Getter @Setter
	private double preco;
	
	@JsonManagedReference
	@ManyToMany
	@JoinTable(name= "PRODUTO_CATEGORIA",
			   joinColumns = @JoinColumn(name = "produto_id"),
			   inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	@Getter @Setter
	private List<Categoria> categorias = new ArrayList<Categoria>();

	public Produto() {}

	public Produto(long id, String descricao, double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
