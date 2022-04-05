package br.com.leonan.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (schema = "sa_rest", name = "tb_usuario_entidade")
public class UsuarioEntidade {
    
    @Id
    @Column(name = "id_usuario_entidade")
    @SequenceGenerator(name = "sq_usuario_entidade", sequenceName = "sq_usuario_entidade", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario_entidade")
    private Long id;

    @Column(name = "id_entidade", nullable = false)
    private Long idEntidade;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "id_perfil", nullable = false)
    private Long idPerfil;

    @Column(name = "nome_documento", length = 500, nullable = false)
    private String nomeDocumento;

    @Column(name = "dt_solicitacao", nullable = false)
    private LocalDateTime dtSolicitacao;

    @Column(name = "ind_autorizacao", nullable = false)
    private Long indAutorizacao;

    @Column(name = "observacao", length = 100)
    private String observacao;

    @Column(name = "cpf_usuario_criacao", length = 11, nullable = false)
    private String cpfUsuarioCriacao;

    @Column(name = "cpf_usuario_alteracao", length = 11)
    private String cpfUsuarioAlteracao;

    @Column(name = "dt_criacao", nullable = false)
    private LocalDateTime dtCriacao;

    @Column(name = "dt_ultima_alteracao")
    private LocalDateTime dtUltimaAlteracao;

    
    public UsuarioEntidade() {
    }

    public UsuarioEntidade(Long id, Long idEntidade, Long idUsuario, Long idPerfil, String nomeDocumento,
            LocalDateTime dtSolicitacao, Long indAutorizacao, String observacao, String cpfUsuarioCriacao,
            String cpfUsuarioAlteracao, LocalDateTime dtCriacao, LocalDateTime dtUltimaAlteracao) {
        this.id = id;
        this.idEntidade = idEntidade;
        this.idUsuario = idUsuario;
        this.idPerfil = idPerfil;
        this.nomeDocumento = nomeDocumento;
        this.dtSolicitacao = dtSolicitacao;
        this.indAutorizacao = indAutorizacao;
        this.observacao = observacao;
        this.cpfUsuarioCriacao = cpfUsuarioCriacao;
        this.cpfUsuarioAlteracao = cpfUsuarioAlteracao;
        this.dtCriacao = dtCriacao;
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEntidade() {
        return idEntidade;
    }

    public void setIdEntidade(Long idEntidade) {
        this.idEntidade = idEntidade;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    public LocalDateTime getDtSolicitacao() {
        return dtSolicitacao;
    }

    public void setDtSolicitacao(LocalDateTime dtSolicitacao) {
        this.dtSolicitacao = dtSolicitacao;
    }

    public Long getIndAutorizacao() {
        return indAutorizacao;
    }

    public void setIndAutorizacao(Long indAutorizacao) {
        this.indAutorizacao = indAutorizacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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

    public LocalDateTime getDtUltimaAlteracao() {
        return dtUltimaAlteracao;
    }

    public void setDtUltimaAlteracao(LocalDateTime dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

    
    
}
