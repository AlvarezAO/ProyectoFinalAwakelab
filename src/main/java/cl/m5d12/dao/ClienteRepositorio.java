package cl.m5d12.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends CrudRepository<Usuario, Integer> {
	
	public Usuario findByRut(String rut);

}
