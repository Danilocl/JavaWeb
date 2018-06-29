package br.senac.rj.control;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.senac.rj.model.Produto;
import br.senac.rj.model.dao.ProdutoDAO;

@Named(value = "controleProduto")
@SessionScoped
public class ControleProduto implements Serializable {

	private static final long serialVersionUID = -5813363659819076807L;

	@EJB
	private ProdutoDAO dao;
	private Produto produto = new Produto();

	public void gravar() {
		dao.gravar(produto);
	}

	public void editar() {
		dao.editar(produto);
	}

	public void remove() {
		dao.remove(produto.getId());
	}

	public Produto buscaPorId() {
		return dao.buscaPorId(produto.getId());
	}

	public List<Produto> listar() {
		return dao.todosObjetos();
	}

	public ProdutoDAO getDao() {
		return dao;
	}

	public void setDao(ProdutoDAO dao) {
		this.dao = dao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setP(Produto p) {
		this.produto = p;
	}

}
