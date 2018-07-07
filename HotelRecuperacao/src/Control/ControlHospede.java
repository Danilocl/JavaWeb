package Control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.Hospede;
import model.Quarto;
import model.Reservas;
import model.dao.HospedeDAO;
import model.dao.ReservaDAO;

@Named(value = "controlHospede")
@SessionScoped
public class ControlHospede implements Serializable {

	@EJB
	private HospedeDAO dao;
	private Hospede hospede;

	public void getNewHospede() {
		hospede = new Hospede();
		hospede.setId(null);

	}

	public void insert() {
		dao.inserir(hospede);
	}

	public void delete(Hospede h) {
		dao.delete(h);
	}

	public void update(Hospede h) {
		dao.update(h);
	}

	public Hospede buscaPorId() {
		return dao.buscaPorId(hospede.getId());
	}

	public List<Hospede> listar() {
		return dao.listAll();
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

}
