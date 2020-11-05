package br.com.sismotos.domain.escala;

import br.com.sismotos.domain.motoqueiro.Motoqueiro;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class EscalaTrabalho extends PanacheEntity{

    @OneToOne
    @JoinColumn(name = "id_motoqueiro_associado", nullable = false)
    public Motoqueiro motoqueiroAssociado;

    @ManyToMany
    @Column(nullable = false)
    public List<HorarioTrabalho> horarios;
}
