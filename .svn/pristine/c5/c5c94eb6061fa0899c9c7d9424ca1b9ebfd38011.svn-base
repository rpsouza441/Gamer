package br.com.gamer.converter;

import java.beans.PropertyEditorSupport;

import br.com.gamer.dao.DAOJogo;
import br.com.gamer.entidades.Jogo;

public class JogoEditor extends PropertyEditorSupport{
	
	private final DAOJogo daoJogo;
	 
    public JogoEditor(DAOJogo daoJogo) {
        this.daoJogo = daoJogo;
    }
 
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println(text+">> editor jogo");
        Jogo jogo= daoJogo.get(Long.parseLong(text));
        setValue(jogo);
    }
 

}
