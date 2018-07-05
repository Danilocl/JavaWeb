package Control;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import model.Hospede;
import model.Quarto;
import model.Reservas;
import model.dao.ReservaDAO;

@Named(value = "controlReserva")
@SessionScoped
public class ControlReservas {

	@EJB
	private ReservaDAO dao;
	private Hospede hospede;
	private List<Quarto> quartos;	
	private Reservas reserva;

	public void getReserva() {
		reserva = new Reservas();
		reserva.setId(null);
		quartos = new ArrayList<Quarto>();

	}

	public void insert() {
		reserva.setHospede(hospede);
		reserva.setQuarto(quartos);

		dao.inserir(reserva);
	}

	public void insertQuarto(Quarto q) {
		do {
			quartos.add(q);
		} while (quartos.size() <= 30);
	}

	public void delete() {
		dao.delete(reserva.getId());
	}

	public void update() {
		dao.update(reserva);
	}

	public Reservas buscaPorId() {
		return dao.buscaPorId(reserva.getId());
	}

	public List<Reservas> listar() {
		return dao.listAll();
	}

}
