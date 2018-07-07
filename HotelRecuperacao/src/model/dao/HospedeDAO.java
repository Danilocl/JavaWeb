package model.dao;

import model.Hospede;
import model.Reservas;

public class HospedeDAO extends DAOGeneric<Hospede>{
	
	public HospedeDAO() {
		persistence = Hospede.class;
		
	}

}
