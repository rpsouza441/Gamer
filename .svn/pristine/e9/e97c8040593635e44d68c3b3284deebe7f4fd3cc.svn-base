package br.com.gamer.entidades;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "console")
public class Console implements java.io.Serializable {

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private long id;

	@NotEmpty
	@Column(name = "nome", nullable = false, length = 128)
	private String nome;

	@NotEmpty
	@NotNull
	@Column(name = "versao", nullable = false, length = 128)
	private String versao;

	@NotEmpty
	@NotNull
	@Column(name = "ram", nullable = false, length = 128)
	private String ram;

	@NotEmpty
	@NotNull
	@Column(name = "cpu", nullable = false, length = 128)
	private String cpu;

	@NotEmpty
	@NotNull
	@Column(name = "hd", nullable = false, length = 128)
	private String hd;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;

	@ManyToMany(mappedBy = "consoles")
	private Collection<Jogo> jogos;

	public Console() {
	}

	public Console(long id, String nome, String versao, String ram, String cpu,
			String hd, Fabricante fabricante, Collection<Jogo> jogos) {
		setId(id);
		setNome(nome);
		setVersao(versao);
		setRam(ram);
		setCpu(cpu);
		setHd(hd);
		setFabricante(fabricante);
		setJogos(jogos);
	}

	public int compareTo(Object o) {
		if (o instanceof Console) {
			return getNome().compareTo(((Console) o).getNome());
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

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Collection<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(Collection<Jogo> jogos) {
		this.jogos = jogos;
	}

}
