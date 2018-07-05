package model.dao;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

import model.Hospede;
import model.Reservas;

@Stateless
public class ReservaDAO extends DAOGeneric<Reservas> {

	public ReservaDAO() {
		persistence = Hospede.class;
	}
}
