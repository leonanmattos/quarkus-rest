package br.com.leonan.resource.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
	
	@NotBlank(message = "{usuario.nome.obrigatorio}")
	private String nome;
	@NotBlank(message = "{usuario.cpf.obrigatorio}")
	private String cpf;
	@Email(message = "{usuario.email.invalido}")
	private String email;
	@Pattern(regexp = "[0-9]{11}", message = "{usuario.numTelefone.invalido}")
	private String numTelefone;
}
