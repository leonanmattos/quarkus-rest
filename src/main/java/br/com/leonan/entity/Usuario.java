package br.com.leonan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "sa_rest", name = "tb_usuario2")
public class Usuario {
	
	@Id
	@Column(name = "id_usuario")
	@SequenceGenerator(name = "sq_usuario", sequenceName = "sq_usuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
	private Long id;
	
	@Column(name = "cpf_usuario", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "nome_usuario", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "num_telefone", length = 15)
	private String numTelefone;
	
	@Column(name = "situacao", nullable = false)
	private Boolean situacao;

	public Usuario(String cpf, String nome, String email, String numTelefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.numTelefone = numTelefone;
		this.situacao = Boolean.TRUE;
	}
}
