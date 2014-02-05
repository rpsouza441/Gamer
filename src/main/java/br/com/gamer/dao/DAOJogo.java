package br.com.gamer.dao;

import java.util.Collection;

import br.com.gamer.entidades.Fabricante;
import br.com.gamer.entidades.Jogo;

public interface DAOJogo extends DAOBase<Jogo>{
	
	
	public Collection<Jogo> getJogosPorFabricante(Fabricante fabricante);
	

}
