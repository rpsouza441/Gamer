package br.com.gamer.dao;

import java.util.List;

import br.com.gamer.entidades.PermissaoPessoa;
import br.com.gamer.entidades.Pessoa;

public interface DAOPermissaoPessoa {
	
	public List<PermissaoPessoa> getPermissoesPessoa(Pessoa pessoa);
	
	public void addRole(String role, Pessoa pessoa);

}
