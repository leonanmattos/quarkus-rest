package br.com.leonan.resource.config;

import java.io.Serializable;

import javax.validation.ConstraintViolation;

public class CustomConstraintViolation implements Serializable {
	
	private static final long serialVersionUID = -4376337922568095362L;
	
	private String mensagem;
	private String atributo;

	public CustomConstraintViolation(ConstraintViolation<?> cv) {
		mensagem = cv.getMessage();
		atributo = cv.getPropertyPath().toString();	
	}

	public String getMensagem() {
		return mensagem;
	}
	
	public String getAtributo() {
		return atributo;
	}

}
