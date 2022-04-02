package br.com.leonan.resource.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CreateUserRequest {
	
	@NotBlank(message = "{usuario.nome.obrigatorio}")
	private String nome;
	@NotBlank(message = "{usuario.cpf.obrigatorio}")
	private String cpf;
	@Email(message = "{usuario.email.invalido}")
	private String email;
	@Pattern(regexp = "[0-9]{11}", message = "{usuario.numTelefone.invalido}")
	private String numTelefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}

}
