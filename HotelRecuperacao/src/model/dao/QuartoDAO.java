package model.dao;

import model.Quarto;

public class QuartoDAO extends DAOGeneric<Quarto> {
	
	public QuartoDAO() {
		persistence = Quarto.class;
	}

}
