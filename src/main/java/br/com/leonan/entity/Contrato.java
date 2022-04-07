package br.com.leonan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "sa_rest", name = "tb_contrato")
public class Contrato {

    @Id
    @Column(name = "id_contrato")
    @SequenceGenerator(name = "sq_contrato", sequenceName = "sq_contrato", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_contrato")
    private Long id;

    @Column(name = "termo_contrato", length = 15, nullable = false)
    private String termoContrato;

    @Column(name = "dt_inicio_operacao", nullable = false)
    private String dtInicioOperacao;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private Entidade entidade;

    public Contrato() {
    }

    public Contrato(Long id, String termoContrato, String dtInicioOperacao, Entidade entidade) {
        this.id = id;
        this.termoContrato = termoContrato;
        this.dtInicioOperacao = dtInicioOperacao;
        this.entidade = entidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermoContrato() {
        return termoContrato;
    }

    public void setTermoContrato(String termoContrato) {
        this.termoContrato = termoContrato;
    }

    public String getDtInicioOperacao() {
        return dtInicioOperacao;
    }

    public void setDtInicioOperacao(String dtInicioOperacao) {
        this.dtInicioOperacao = dtInicioOperacao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    

    

    
}
