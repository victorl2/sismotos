package br.com.sismotos.domain.escala;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Horario de trabalho de um {@link br.com.sismotos.domain.motoqueiro.Motoqueiro},
 * defino pelo Turno ( manha, tarde e noite ) e o dia da semana ( segunda, terça, ... ).
 */
@Entity
public class HorarioTrabalho extends PanacheEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public DiaSemana dia;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public TurnoTrabalho turno;
}
