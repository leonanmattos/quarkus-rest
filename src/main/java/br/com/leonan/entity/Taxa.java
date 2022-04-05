package br.com.leonan.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "sa_rest", name = "tb_taxa")
public class Taxa {

    @Id
    @Column(name = "id_taxa")
    @SequenceGenerator(name = "sq_taxa", sequenceName = "sq_taxa", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_taxa")
    private Long id;

    @Column(name = "nome_taxa", length = 100, nullable = false)
    private String nome;

    @Column(name = "dt_inicio_vigencia", nullable = false)
    private LocalDateTime dtInicioVigencia;

    @Column(name = "dt_fim_vigencia", nullable = false)
    private LocalDateTime dtFimVigencia;

    @Column(name = "percentual_taxa", nullable = false)
    private Double percentualTaxa;

    @Column(name = "situacao", nullable = false)
    private Boolean situacao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "tb_entidade_taxa",
        joinColumns = @JoinColumn(name = "id_taxa"),
        inverseJoinColumns = @JoinColumn(name = "id_entidade")
    )
    private Set<Entidade> entidades;

    public Taxa() {
    }

    

}
