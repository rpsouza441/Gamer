package br.com.gamer.converter;

import java.beans.PropertyEditorSupport;

import br.com.gamer.dao.DAOFabricante;
import br.com.gamer.entidades.Fabricante;

public class FabricanteEditor extends PropertyEditorSupport{
	
	private final DAOFabricante daoFabricante;
	 
    public FabricanteEditor(DAOFabricante daoFabricante) {
        this.daoFabricante = daoFabricante;
    }
 
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println(text+">> editor fabricante");
        Fabricante fabricante= daoFabricante.get(Long.parseLong(text));
        setValue(fabricante);
    }
 

}
