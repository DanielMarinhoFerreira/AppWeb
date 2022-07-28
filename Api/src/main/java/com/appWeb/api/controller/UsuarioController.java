package com.appWeb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appWeb.api.DAO.IUsuario;
import com.appWeb.api.model.Usuario;

/*
 * Criando uma classe que recebe as requisições do EndPoint.
 *
 * @RestController -> pegar as requisições.
 * @GetMapping -> monta Endpoint para a requisição devolver o retorno.
 * 
 * */
@RestController 
public class UsuarioController {
	
	@Autowired
	private IUsuario dao;
	
	@GetMapping("/usuario")
	public List<Usuario> usuarioLista() {
		return (List<Usuario>)dao.findAll();
	}

}
