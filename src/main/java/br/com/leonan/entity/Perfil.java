package br.com.leonan.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "sa_rest", name = "tb_perfil")
public class Perfil {

    @Id
    @Column(name = "id_perfil")
    @SequenceGenerator(name = "sq_perfil", sequenceName = "sq_perfil", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_perfil")
    private Long id;

    @Column(name = "nome_perfil", length = 50, nullable = false)
    private String nome;

    @Column(name = "situacao", nullable = false)
    private String situacao;


    @OneToMany(mappedBy = "idPerfil", fetch = FetchType.LAZY)
    private Set<UsuarioEntidade> usuarioEntidade;

    public Perfil() {
    }


    public Perfil(Long id, String nome, String situacao, Set<UsuarioEntidade> usuarioEntidade) {
        this.id = id;
        this.nome = nome;
        this.situacao = situacao;
        this.usuarioEntidade = usuarioEntidade;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSituacao() {
        return situacao;
    }


    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public Set<UsuarioEntidade> getUsuarioEntidade() {
        return usuarioEntidade;
    }


    public void setUsuarioEntidade(Set<UsuarioEntidade> usuarioEntidade) {
        this.usuarioEntidade = usuarioEntidade;
    }


    

    
    
}
