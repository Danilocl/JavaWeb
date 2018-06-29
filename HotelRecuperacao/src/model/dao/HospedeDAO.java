package model.dao;

import javax.persistence.PersistenceContext;

import model.Hospede;

public class HospedeDAO extends DAOGeneric<Hospede> {

	public HospedeDAO() {
		persistence = Hospede.class;
	}
}
