package br.senac.rj.model.dao;

import javax.ejb.Stateless;

import br.senac.rj.model.Produto;

@Stateless
public class ProdutoDAO extends DAOGenerics<Produto> {

	public ProdutoDAO() {
		classPersistence = Produto.class;

	}
	
	
}
