package com.vetspaws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vetspaejb.entity.Usuario;
import com.vetspaejb.facade.UsuarioFacadeLocal;

@WebService(name = "UsuarioService", serviceName = "UsuarioService")
public class UsuarioService implements EntityService<Usuario> {
	
	@EJB
	private UsuarioFacadeLocal usuarioFacade;
	
	public UsuarioService() {
	}

	@Override
	@WebMethod
	public int insert(Usuario toInsert) {
		usuarioFacade.create(toInsert);
		return toInsert.getId();
	}

	@Override
	@WebMethod
	public boolean update(Usuario toUpdate) {
		return usuarioFacade.edit(toUpdate);
	}

	@Override
	@WebMethod
	public boolean delete(Object id) {
		return usuarioFacade.remove(usuarioFacade.find(id));
	}

	@Override
	@WebMethod
	public Usuario find(Object id) {
		return usuarioFacade.find(id);
	}

	@Override
	@WebMethod
	public List<Usuario> findAll() {
		return usuarioFacade.findAll();
	}
	
}
