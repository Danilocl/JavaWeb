package model.dao;

import model.Reservas;

public class ReservasDAO extends DAOGeneric<ReservasDAO>{
	
	public ReservasDAO() {
		persistence = Reservas.class;
		
	}

}
