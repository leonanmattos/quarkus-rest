package br.com.leonan.service;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;

import br.com.leonan.entity.Entidade;
import br.com.leonan.repository.EntidadeRepository;
import br.com.leonan.resource.request.CreateEntidadeRequest;

@ApplicationScoped
public class EntidadeService {
    
    private EntidadeRepository entidadeRepository;

    public EntidadeService(EntidadeRepository entidadeRepository) {
        this.entidadeRepository = entidadeRepository;
    }

    /**
     * Método responsável por obter entidade por id
     * @param id
     * @return Entidade
     */
    public Entidade findById(Long id) {
        return entidadeRepository.findByIdOptional(id).orElseThrow(() -> new NotFoundException());
    }

        
    /**
     * Método responsável por salvar entidade
     * @param createUserRequest
     * @return Entidade
     */    
    public Entidade create(CreateEntidadeRequest createEntidadeRequest){
        Entidade entidade = new Entidade(createEntidadeRequest.getCnpj(), createEntidadeRequest.getNome(), createEntidadeRequest.getEmail(), createEntidadeRequest.getNumTelefonePrincipal());
        entidadeRepository.persist(entidade);
        return entidade;
    }

}
