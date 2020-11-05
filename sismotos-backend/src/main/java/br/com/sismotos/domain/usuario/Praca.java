package br.com.sismotos.domain.usuario;

import br.com.sismotos.domain.motoqueiro.Motoqueiro;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Praca extends PanacheEntity {
    public String nome;

    @OneToMany(mappedBy = "pracaAtuacao")
    public List<Motoqueiro> motoqueiros;
}
