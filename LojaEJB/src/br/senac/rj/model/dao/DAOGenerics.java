package br.senac.rj.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class DAOGenerics<T> {

	@PersistenceContext(unitName = "LojaEJB")
	protected EntityManager em;

	protected Class classPersistence;

	public void gravar(T obj) {
		em.persist(obj);
	}

	public void editar(T obj) {

		em.merge(obj);

	}

	public T buscaPorId(Integer id) {

		return (T) em.find(classPersistence, id);

	}

	public void remove(Integer id) {

		T obj = buscaPorId(id);

		em.remove(obj);
	}

	public List<T> todosObjetos() {

		return em.createQuery("from " + classPersistence.getName()).getResultList();
		
				

	}
}
