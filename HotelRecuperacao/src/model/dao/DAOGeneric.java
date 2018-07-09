package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Hospede;
import model.Quarto;
import model.Reservas;

public class DAOGeneric<T> {

	@PersistenceContext(unitName = "HotelDB")
	protected EntityManager em;

	protected Class persistence;
	Hospede h;
	Quarto q;
	Reservas reservas;

	/*
	 * Criar um método para inserir as reservas
	 */
	public void inserir(T obj) {

		em.persist(obj);

	}

	public void update(T obj) {
		em.merge(obj);
	}

	public T buscaPorId(Integer id) {

		return (T) em.find(persistence, id);

	}

	public void delete(T obj) {
		obj = em.merge(obj);
		em.remove(obj);
	}

	public List<T> listAll() {
//		List<Reservas> list = new ArrayList<Reservas>();
//		Reservas reservas = new Reservas();
//		reservas.setHospede(reservas.getHospede());
//		reservas.setQuarto(reservas.getQuarto());
//		reservas.setDataSaida(reservas.getDataSaida());
//		list.add(reservas);

		return em.createQuery("select from" + persistence.getName()).getResultList();
	}
}
