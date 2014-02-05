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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa")
public class Pessoa implements java.io.Serializable {

	@Id
	@Generated(GenerationTime.INSERT)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 128)
	private long id;

	@NotNull
	@NotEmpty
	@Column(name = "nome", nullable = false, length = 128)
	private String nome;

	@NotNull
	@NotEmpty
	@Column(name = "sobrenome", nullable = false, length = 128)
	private String sobrenome;

	@Size(min = 6, max = 32, message = "login muito curto ou muito longo")
	@Column(name = "login", nullable = false, unique = true, length = 64)
	private String login;

	private transient String senha;

	@Column(name = "hash_senha", nullable = false, length = 128)
	private String hashSenha;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "pessoa_jogo", joinColumns = { @JoinColumn(name = "pessoa_id") }, inverseJoinColumns = { @JoinColumn(name = "jogo_id") })
	private Collection<Jogo> jogos;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "pessoa_console", joinColumns = { @JoinColumn(name = "pessoa_id") }, inverseJoinColumns = { @JoinColumn(name = "console_id") })
	private Collection<Console> consoles;

	public Pessoa() {
		super();
	}

	public Pessoa(long id, String nome, String sobrenome, String login,
			String senha, String hashSenha, Collection<Jogo> jogos,
			Collection<Console> consoles) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.login = login;
		this.senha = senha;
		this.hashSenha = hashSenha;
		this.jogos = jogos;
		this.consoles = consoles;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Collection<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(Collection<Jogo> jogos) {
		this.jogos = jogos;
	}

	public Collection<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(Collection<Console> consoles) {
		this.consoles = consoles;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHashSenha() {
		return hashSenha;
	}

	public void setHashSenha(String valor) {
		this.hashSenha = valor;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		setHashSenha(org.apache.commons.codec.digest.DigestUtils
				.sha256Hex(senha));
		this.senha = senha;
	}

}
