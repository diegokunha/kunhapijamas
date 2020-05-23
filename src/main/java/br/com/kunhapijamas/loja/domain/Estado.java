package br.com.kunhapijamas.loja.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Estado implements Serializable{

	private static final long serialVersionUID = 1748109879868487269L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private long id;
	
	@Getter @Setter
	private String descricao;
	
	@JsonBackReference
	@OneToMany(mappedBy = "estado")
	@Getter @Setter
 	private List<Cidade> cidades = new ArrayList<Cidade>();
	
	public Estado() {}

	public Estado(long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
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
		Estado other = (Estado) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
