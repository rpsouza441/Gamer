package br.com.gamer.dao.hibernate;

import java.util.Collection;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.gamer.dao.DAOConsole;
import br.com.gamer.entidades.Console;
import br.com.gamer.entidades.Fabricante;

@Repository("daoConsole")
public class HBConsole extends HBDAO<Console> implements DAOConsole {

	@Override
	public Collection<Console> getConsolesPorFabricante(Fabricante fabricante) {
		Query busca = getSession().createQuery("from Console c where c.fabricante = ?");
		busca.setEntity(0, fabricante);
		return busca.list();
	}

	@Override
	protected Class getClazz() {
		return Console.class;

	}

}
