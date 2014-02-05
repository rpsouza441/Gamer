package br.com.gamer.entidades;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@SuppressWarnings("serial")
@Entity
@Table(name = "jogo")
public class Jogo implements java.io.Serializable {
	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false, unique = true)
	private long id;

	@Column(name = "nome",nullable=false, length = 128)
	private String nome;

	@Column(name = "descricao",nullable=false,  length = 256)
	private String descricao;

	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "console_jogo", joinColumns = {@JoinColumn(name = "jogo_id")}, 
	inverseJoinColumns = {@JoinColumn(name = "console_id")})
	private Collection<Console> consoles;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;

	public Jogo() {
		
	}

	public Jogo(long id, String nome, String descricao,
			Collection<Console> consoles, Fabricante fabricante) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.consoles = consoles;
		this.fabricante = fabricante;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(Collection<Console> consoles) {
		this.consoles = consoles;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public int compareTo(Object o) {
		if (o instanceof Jogo) {
			return getNome().compareTo(((Jogo) o).getNome());
		} else {
			return 0;
		}
	}

}
