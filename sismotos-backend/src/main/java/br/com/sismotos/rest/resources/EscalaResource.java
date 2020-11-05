package br.com.sismotos.rest.resources;

import br.com.sismotos.rest.dto.EscalaTrabalhoDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/escala")
@Produces(MediaType.APPLICATION_JSON)
public class EscalaResource {

    @GET
    @Path("/{cpf}")
    public EscalaTrabalhoDTO buscarEscalaMotoqueiro(@PathParam("cpf") final String cpf){
        return null;
    }
}
