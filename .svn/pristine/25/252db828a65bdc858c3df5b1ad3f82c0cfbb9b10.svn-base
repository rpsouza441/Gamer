package br.com.gamer.converter;

import java.beans.PropertyEditorSupport;

import br.com.gamer.dao.DAOConsole;
import br.com.gamer.entidades.Console;

public class ConsoleEditor extends PropertyEditorSupport{
	
	private final DAOConsole daoConsole;
	 
    public ConsoleEditor(DAOConsole daoConsole) {
        this.daoConsole = daoConsole;
    }
 
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println(text+">> editor console");
        Console console= daoConsole.get(Long.parseLong(text));
        setValue(console);
    }
 

}
