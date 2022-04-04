package br.com.leonan.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.leonan.entity.Entidade;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EntidadeRepository implements PanacheRepository<Entidade> {
    
    
    /** 
     * Retorna o nome da entidade a partir do Cnpj.
     * @param cnpj
     * @return Entidade
     * @throws Exception 
     * @version 1.0.0
     */

    public Entidade findEntidade() {
        return null;

    }
    
}
