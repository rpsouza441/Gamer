package br.com.gamer.entidades;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("serial")
@Entity
@Table(name = "fabricante")
public class Fabricante implements java.io.Serializable {

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private long id;

	@NotNull
	@NotEmpty
	@Column(name = "nome", nullable = false, unique = true, length = 128)
	private String nome;

	@Column(name = "data", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data;

	@OneToMany(mappedBy = "fabricante")
	private Collection<Console> consoles;

	public Fabricante(int id, String nome, Date data,
			Collection<Console> consoles) {
		setId(id);
		setNome(nome);
		setData(data);
		setConsoles(consoles);
	}

	public Fabricante() {
	}

	public int compareTo(Object o) {
		if (o instanceof Fabricante) {
			return getNome().compareTo(((Fabricante) o).getNome());
		} else {
			return 0;
		}
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Collection<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(Collection<Console> consoles) {
		this.consoles = consoles;
	}

}
