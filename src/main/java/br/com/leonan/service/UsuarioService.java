package br.com.leonan.service;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;

import br.com.leonan.entity.Usuario;
import br.com.leonan.repository.UsuarioRepository;
import br.com.leonan.resource.request.CreateUserRequest;

@ApplicationScoped
public class UsuarioService {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	/**
	 * Método responsável por obter por id
	 * @param id
	 * @return Usuario
	 */
	public Usuario findById(Long id) {
		return usuarioRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException());
	}
	
	/**
	 * Método responsável por salvar o usuário
	 * @param createUserRequest
	 * @return Usuario
	 */
	public Usuario create(CreateUserRequest createUserRequest) {
		Usuario usuario = new Usuario(createUserRequest.getCpf(), createUserRequest.getNome(), createUserRequest.getEmail(), createUserRequest.getNumTelefone());
		usuarioRepository.persist(usuario);
		return usuario;
	}
	
	public Usuario selectStartWithV() {
		return usuarioRepository.selectStartWithV();
	}

}
