package br.com.leonan.resource;

import java.net.URI;

import javax.ws.rs.Produces;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.leonan.entity.Entidade;
import br.com.leonan.resource.request.CreateEntidadeRequest;
import br.com.leonan.service.EntidadeService;

@Path("/entidade")
public class EntidadeResource {

    private EntidadeService entidadeService;

    public EntidadeResource(EntidadeService entidadeService) {
        this.entidadeService = entidadeService;
    }

    @GET
    @Path("/{id:[0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") Long id) {
        Entidade entidade = entidadeService.findById(id);
        return Response.ok(entidade).build();
    }
    
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Transactional
    public Response create(@Valid CreateEntidadeRequest createEntidadeRequest) {
        Entidade entidade = entidadeService.create(createEntidadeRequest);
        return Response.created(URI.create(String.valueOf(entidade.getId()))).entity(entidade).build();
    }
}
