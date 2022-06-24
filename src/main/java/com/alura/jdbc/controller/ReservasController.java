package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Reservas;

public class ReservasController {
	private ReservasDAO huespedesDAO;

	public ReservasController(ReservasDAO ReservasDAO) {
		var factory = new ConnectionFactory();
		this.ReservasDAO = new ReservasDAO(factory.recuperaConexion());
	}
	
	public List<Reservas> listar() {
        return this.ReservasDAO.listar();
    }
	
	/*
	 *  public List<Reservas> cargaReporte() {
	        return this.ReservasDAO.listarConProductos();
	    }
	 */
	
}
