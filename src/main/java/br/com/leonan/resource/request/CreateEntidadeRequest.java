package br.com.leonan.resource.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CreateEntidadeRequest {
    /**
     * Cria uma nova entidade com validação de campos obrigatórios.
     * Campos obrigatorios: nome, cnpj, email, numTelefone
     * @return Entidade
     */
    
    @NotBlank(message = "{entidade.cnpj.obrigatorio}")
    private String cnpj;
    @NotBlank(message = "{entidade.nome.obrigatorio}")
    private String nome;
    @Email(message = "{entidade.email.invalido}")
    private String email;
    @NotBlank(message = "{entidade.numTelefone.obrigatorio}")
    private String numTelefonePrincipal;
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumTelefonePrincipal() {
        return numTelefonePrincipal;
    }
    public void setNumTelefonePrincipal(String numTelefonePrincipal) {
        this.numTelefonePrincipal = numTelefonePrincipal;
    }

    

}
