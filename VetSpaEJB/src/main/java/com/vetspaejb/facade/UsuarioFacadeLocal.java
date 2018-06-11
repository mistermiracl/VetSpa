package com.vetspaejb.facade;

import javax.ejb.Local;

import com.vetspaejb.entity.Usuario;

@Local
public interface UsuarioFacadeLocal extends EntityFacade<Usuario>{
	Usuario login(String username, String password);
}
