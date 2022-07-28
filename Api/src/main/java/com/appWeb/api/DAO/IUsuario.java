package com.appWeb.api.DAO;

import org.springframework.data.repository.CrudRepository;

import com.appWeb.api.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
