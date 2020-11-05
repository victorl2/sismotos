package br.com.sismotos.rest.dto;

import br.com.sismotos.domain.escala.EscalaTrabalho;

import java.util.List;

public class EscalaTrabalhoDTO {
    public String cpfMotoqueiro;
    public List<EscalaTrabalhoDTO> horarios;

    public EscalaTrabalhoDTO(EscalaTrabalho escala){

    }
}
