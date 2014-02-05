package br.com.gamer.dao.hibernate;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.gamer.dao.DAOPessoa;
import br.com.gamer.entidades.Pessoa;


@Transactional(propagation=Propagation.SUPPORTS)
@Repository("daoPessoa")
public class HBPessoa extends HBDAO<Pessoa> implements DAOPessoa{
	
	
	protected Class getClazz(){
		return Pessoa.class;
	}

	@Override
	public Pessoa getPessoa(String login, String senha) {
		Query query = getSession().createQuery("from Pessoa p where p.login = ? and p.hashSenha = ?");
		query.setString(0, login);
		query.setString(1, DigestUtils.sha256Hex(senha));
		return (Pessoa) query.uniqueResult();
	}

	@Override
	public Pessoa getPessoa(String login) {
		Query query = getSession().createQuery("from Pessoa p where p.login = ?");
		query.setString(0, login);
		return (Pessoa) query.uniqueResult();
	}
	
	

}
