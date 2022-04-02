package br.com.leonan.resource;


import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.leonan.entity.Usuario;
import br.com.leonan.resource.request.CreateUserRequest;
import br.com.leonan.service.UsuarioService;

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
    	Usuario usuario = usuarioService.create(createUserRequest);
        return Response.created(URI.create(String.valueOf(usuario.getId()))).entity(usuario).build();
    }
}