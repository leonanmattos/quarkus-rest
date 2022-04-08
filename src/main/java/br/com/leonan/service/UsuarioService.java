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
	 * Método responsável por criar usuario
	 * @param cpf
	 * @param nome
	 * @param email
	 * @param numTelefone
	 * @return Usuario
	 */
	public Usuario create(String cpf, String nome, String email, String numTelefone) {
		Usuario usuario = Usuario.builder().cpf(cpf)
				.nome(nome)
				.email(email)
				.numTelefone(numTelefone)
				.situacao(Boolean.TRUE)
				.build();
		usuarioRepository.persist(usuario);
		return usuario;
	}
	
	public Usuario selectStartWithV() {
		return usuarioRepository.selectStartWithV();
	}

}
