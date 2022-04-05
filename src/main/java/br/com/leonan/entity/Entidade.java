package br.com.leonan.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(schema = "sa_rest", name = "tb_entidade")
public class Entidade {

    @Id
    @Column(name = "id_entidade")
    @SequenceGenerator(name = "sq_entidade", sequenceName = "sq_entidade", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_entidade")
    private long id;

    @Column(name = "nome_entidade", length = 150, nullable = false)
    private String nome;
    
    @Column(name = "cnpj", length = 15, nullable = false)
    private String cnpj;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "cep", length = 8)
    private String cep;

    @Column(name = "logradouro", length = 100)
    private String logradouro;

    @Column(name = "num_logradouro", length = 20)
    private String numLogradouro;

    @Column(name = "complemento", length = 50)
    private String complemento;

    @Column(name = "bairro", length = 50)
    private String bairro;

    @Column(name = "municipio", length = 100)
    private String municipio;

    @Column(name = "sigla_uf", length = 2)
    private String siglaUf;

    @Column(name = "num_telefone_principal", length = 15)
    private String numTelefonePrincipal;

    @Column(name = "num_telefone_secundario", length = 15)
    private String numTelefoneSecundario;

    @Column(name = "situacao_autorizacao", nullable = false)
    private Boolean situacao;

    @Column(name = "observacao", length = 150)
    private String observacao;

    @Column(name = "situacao", nullable = false)
    private boolean situacaoEntidade;

    @Column(name = "dt_solicitacao", nullable = false)
    private LocalDateTime dtSolicitacao;

    @Column(name = "cpf_usuario_criacao", length = 11, nullable = false)
    private String cpfUsuarioCriacao;

    @Column(name = "cpf_usuario_alteracao", length = 11)
    private String cpfUsuarioAlteracao;

    @OrderBy("dt_solicitacao DESC")


    @CreationTimestamp
    @Column(name = "dt_criacao", nullable = false)
    private LocalDateTime dtCriacao;

    @Column(name = "dt_alteracao")
    private LocalDateTime dtAlteracao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tb_entidade_taxa",
        joinColumns = @JoinColumn(name = "id_entidade"),
        inverseJoinColumns = @JoinColumn(name = "id_taxa")
    )
    private Set<Taxa> taxas;

    @OneToMany(mappedBy = "id_entidade", fetch = FetchType.LAZY)
    private Set<UsuarioEntidade> usuarios;
    

    public Entidade() { }

    public Entidade(String nome, String cnpj, String email, String numTelefonePrincipal) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.numTelefonePrincipal = numTelefonePrincipal;
    }    

    public Entidade(long id, String nome, String cnpj, String email, String cep, String logradouro,
            String numLogradouro, String complemento, String bairro, String municipio, String siglaUf,
            String numTelefonePrincipal, String numTelefoneSecundario, Boolean situacao, String observacao,
            boolean situacaoEntidade, LocalDateTime dtSolicitacao, String cpfUsuarioCriacao, String cpfUsuarioAlteracao,
            LocalDateTime dtCriacao, LocalDateTime dtAlteracao, Set<Taxa> taxas, Set<UsuarioEntidade> usuarios) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numLogradouro = numLogradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.siglaUf = siglaUf;
        this.numTelefonePrincipal = numTelefonePrincipal;
        this.numTelefoneSecundario = numTelefoneSecundario;
        this.situacao = situacao;
        this.observacao = observacao;
        this.situacaoEntidade = situacaoEntidade;
        this.dtSolicitacao = dtSolicitacao;
        this.cpfUsuarioCriacao = cpfUsuarioCriacao;
        this.cpfUsuarioAlteracao = cpfUsuarioAlteracao;
        this.dtCriacao = dtCriacao;
        this.dtAlteracao = dtAlteracao;
        this.taxas = taxas;
        this.usuarios = usuarios;
    }

    public Set<Taxa> getTaxas() {
        return taxas;
    }

    public void setTaxas(Set<Taxa> taxas) {
        this.taxas = taxas;
    }

    public Set<UsuarioEntidade> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioEntidade> usuarios) {
        this.usuarios = usuarios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumLogradouro() {
        return numLogradouro;
    }

    public void setNumLogradouro(String numLogradouro) {
        this.numLogradouro = numLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getNumTelefonePrincipal() {
        return numTelefonePrincipal;
    }

    public void setNumTelefonePrincipal(String numTelefonePrincipal) {
        this.numTelefonePrincipal = numTelefonePrincipal;
    }

    public String getNumTelefoneSecundario() {
        return numTelefoneSecundario;
    }

    public void setNumTelefoneSecundario(String numTelefoneSecundario) {
        this.numTelefoneSecundario = numTelefoneSecundario;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isSituacaoEntidade() {
        return situacaoEntidade;
    }

    public void setSituacaoEntidade(boolean situacaoEntidade) {
        this.situacaoEntidade = situacaoEntidade;
    }

    public LocalDateTime getDtSolicitacao() {
        return dtSolicitacao;
    }

    public void setDtSolicitacao(LocalDateTime dtSolicitacao) {
        this.dtSolicitacao = dtSolicitacao;
    }

    public String getCpfUsuarioCriacao() {
        return cpfUsuarioCriacao;
    }

    public void setCpfUsuarioCriacao(String cpfUsuarioCriacao) {
        this.cpfUsuarioCriacao = cpfUsuarioCriacao;
    }

    public String getCpfUsuarioAlteracao() {
        return cpfUsuarioAlteracao;
    }

    public void setCpfUsuarioAlteracao(String cpfUsuarioAlteracao) {
        this.cpfUsuarioAlteracao = cpfUsuarioAlteracao;
    }

    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public LocalDateTime getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(LocalDateTime dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    

}
