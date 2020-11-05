package br.com.sismotos.domain.motoqueiro;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class ContaBancaria extends PanacheEntity {
    @NotEmpty(message = "É necessário informaro o código do Banco")
    @Column(name="numero_banco", nullable = false)
    public String codigoBanco;

    @NotEmpty(message = "É necessário informaro o número da conta")
    @Column(name="conta", nullable = false)
    public String conta;

    @NotEmpty(message = "É necessário informaro o número da agencia")
    @Column(name="agencia", nullable = false)
    public String agencia;
}
