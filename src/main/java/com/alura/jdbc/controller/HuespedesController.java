package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.dao.HuespedesDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class HuespedesController {
	private HuespedesDAO huespedesDAO;

	public HuespedesController() {
		var factory = new ConnectionFactory();
		this.huespedesDAO = new HuespedesDAO(factory.recuperaConexion());
	}
	
	/*
	 * public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
        return productoDao.modificar(nombre, descripcion, cantidad, id);
    }

    public int eliminar(Integer id) {
        return productoDao.eliminar(id);
    }


	 * 
	 */
	    public List<Huespedes> listar() {
        return huespedesDAO.listar();
    }

    public void guardar(Huespedes huesped, Integer id) {
        huesped.setCategoriaId(id);
        huespedesDAO.guardar(huesped);
    }

    public List<Huesped> listar(Categoria categoria) {
        return productoDao.listar(categoria);
    }
	
	
}
