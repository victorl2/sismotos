package br.com.sismotos.domain.usuario;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario extends PanacheEntity {
    @NotNull(message = "É necessário definir o tipo de usuário")
    @Column(name="tipo_usuario", nullable = false)
    public TipoUsuario tipoUsuario;

    @ManyToOne
    @Column(name="praca_atuacao", nullable = false)
    public Praca pracaAtuacao;

    @NotEmpty(message = "É necessário informar o login do usuário")
    @Column(nullable = false)
    public String login;

    @NotEmpty(message = "É necessário possuir a hash da senha")
    @Column(name="hash_senha", nullable = false)
    public String hashSenha;
}
