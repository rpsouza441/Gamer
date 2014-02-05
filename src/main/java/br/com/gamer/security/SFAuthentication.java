package br.com.gamer.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import br.com.gamer.entidades.PermissaoPessoa;
import br.com.gamer.entidades.Pessoa;

public class SFAuthentication implements Authentication {
	private final Pessoa pessoa;
	private boolean autenticado;

	public SFAuthentication(Pessoa pessoa, List<PermissaoPessoa> permissoes) {
		this.pessoa = pessoa;
		this.permissoes = permissoes;

	}

	@Override
	public String getName() {

		return pessoa != null ? pessoa.getNome() : null;
	}

	private List<PermissaoPessoa> permissoes;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return permissoes;
	}

	@Override
	public Object getCredentials() {

		return pessoa != null ? pessoa.getHashSenha() : null;
	}

	@Override
	public Object getDetails() {
		return pessoa;
	}

	@Override
	public Object getPrincipal() {

		return pessoa != null ? pessoa.getLogin() : null;
	}

	@Override
	public boolean isAuthenticated() {
		return this.autenticado;
	}

	@Override
	public void setAuthenticated(boolean arg0) throws IllegalArgumentException {
		this.autenticado = isAuthenticated();
	}

}
