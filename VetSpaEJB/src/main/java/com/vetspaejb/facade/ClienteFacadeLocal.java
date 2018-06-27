package com.vetspaejb.facade;

import javax.ejb.Local;

import com.vetspaejb.entity.Cliente;

@Local
public interface ClienteFacadeLocal extends EntityFacade<Cliente>{
	Cliente findByDNI(String dni);
}
