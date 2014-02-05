package br.com.gamer.dao.hibernate;

import java.util.Collection;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.gamer.dao.DAOJogo;
import br.com.gamer.entidades.Fabricante;
import br.com.gamer.entidades.Jogo;

@Repository("daoJogo")
public class HBJogo extends HBDAO<Jogo> implements DAOJogo{

	@Override
	public Collection<Jogo> getJogosPorFabricante(Fabricante fabricante) {
		Query busca = getSession().createQuery("from Jogo j where j.fabricante = ?");
		busca.setEntity(0, fabricante);
		return busca.list();
	}

	@Override
	protected Class getClazz() {
		return Jogo.class;
	}
	

}
