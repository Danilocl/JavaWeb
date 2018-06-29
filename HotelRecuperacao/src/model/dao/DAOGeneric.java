package model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DAOGeneric<T> {

	@PersistenceContext(unitName = "HotelDB")

	EntityManager em;

	protected Class persistence;
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
	public void delete (Integer id) {
		T obj = buscaPorId(id);
		em.remove(obj);
	}
	
	public List<T> listAll() {
		return em.createQuery("select from" + persistence.getName()).getResultList();
	}
}
