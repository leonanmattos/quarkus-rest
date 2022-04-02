package br.com.leonan.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import br.com.leonan.entity.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
	
	public Usuario selectStartWithV() {
		String q = "SELECT u FROM Usuario u WHERE u.nome LIKE 'V%' AND u.cpf = :cpf";
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cpf", "07076964962");
		
		return find(q, params).firstResult();
	}
	
}
