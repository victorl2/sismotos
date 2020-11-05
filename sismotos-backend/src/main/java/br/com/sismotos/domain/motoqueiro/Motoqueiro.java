package br.com.sismotos.domain.motoqueiro;

import br.com.sismotos.domain.usuario.Praca;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Optional;

@Entity
@Table(name = "motoqueiro")
public class Motoqueiro extends PanacheEntity {

    @Column(length = 11)
    @NotEmpty(message = "Campo CPF não pode ser vazio")
    @Size(min = 11, max = 11, message = "O CPF deve conter apenas 11 caracteres")
    public String cpf;

    @ManyToOne
    @Column(name="praca_atuacao", nullable = false)
    public Praca pracaAtuacao;

    @Column(length = 100)
    @Size(min = 5, max = 100)
    public String nome;

    @Column(name="placa_moto")
    public String placaMoto;

    @OneToOne
    @Column(nullable = false)
    public ContaBancaria conta;

    @Column(nullable = false)
    public Boolean habilitado;

    /**
     * Busca um {@link Motoqueiro} por seu cpf
     * @param cpf do motoqueiro
     * @return {@link Motoqueiro} que possui o cpf informado
     */
    public static Optional<Motoqueiro> findByCpf(final String cpf){
        return Motoqueiro.find("cpf = ?1 and habilitado = true", cpf).firstResultOptional();
    }

    /**
     * Realiza a exclusão lógica do motoqueiro
     */
    public void desabilitar(){
        habilitado = false;
    }
}
