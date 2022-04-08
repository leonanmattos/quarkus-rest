package br.com.leonan.resource;


import br.com.leonan.entity.Usuario;
import br.com.leonan.resource.request.CreateUserRequest;
import br.com.leonan.service.UsuarioService;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/usuario")
public class UsuarioResource {
	
	private UsuarioService usuarioService;
	
	public UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

    @GET
    @Path("/{id:[0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") Long id) {
    	Usuario usuario = usuarioService.findById(id);
        return Response.ok(usuario).build();
    }
    
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Transactional
    public Response create(@Valid CreateUserRequest createUserRequest) {
    	Usuario usuario = usuarioService.create(createUserRequest.getCpf(), createUserRequest.getNome(), createUserRequest.getEmail(), createUserRequest.getNumTelefone());
        return Response.created(URI.create(String.valueOf(usuario.getId()))).entity(usuario).build();
    }
}