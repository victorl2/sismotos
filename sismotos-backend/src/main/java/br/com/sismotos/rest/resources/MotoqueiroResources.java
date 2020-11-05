package br.com.sismotos.rest.resources;

import br.com.sismotos.domain.motoqueiro.Motoqueiro;
import br.com.sismotos.rest.dto.MotoqueiroDTO;
import br.com.sismotos.service.validations.NovoMotoqueiroValido;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("motoqueiro/")
public class MotoqueiroResources {

    @GET
    public List<MotoqueiroDTO> buscarMotoqueirosPorPraca(){
        return Arrays.asList();
    }

    @GET
    @Path("/{cpf}")
    @Produces(MediaType.APPLICATION_JSON)
    public MotoqueiroDTO buscarMotoqueiroPorCPF(@PathParam("cpf") final String cpf) {
        return Motoqueiro.findByCpf(cpf).map(MotoqueiroDTO::new)
                .orElseThrow(() -> new WebApplicationException("Não foi possível encontrar um motoqueiro com o cpf informado"));
    }

    @POST
    @Transactional
    public void cadastrarNovoMotoqueiro(@NovoMotoqueiroValido MotoqueiroDTO novoMotoqueiro){
        novoMotoqueiro.converter().persist();
    }

    @PUT
    @Path("/{cpf}")
    public void atualizarCadastroMotoqueiro(@PathParam("cpf") final String cpf, MotoqueiroDTO novosDados){

    }

    @DELETE
    @Path("/{cpf}")
    public void desabilitarMotoqueiro(final String cpf){
        Motoqueiro.findByCpf(cpf).map(motoqueiro ->  {
            motoqueiro.desabilitar();
            motoqueiro.persist();
            return motoqueiro;
        }).orElseThrow(() -> new WebApplicationException("Não foi possível encontrar um motoqueiro com o cpf informado"));
    }

}
