package br.com.sismotos.domain.gratificacoes;

import br.com.sismotos.domain.motoqueiro.Motoqueiro;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Premiações concedidas aos {@link br.com.sismotos.domain.motoqueiro.Motoqueiro} por bom desempenho nas entregas.
 * As premiações podem ser diversas, por exemplo Tanque de Combustivel, TV, dinheiro em especie e outros.
 */
@Entity
public class Gratificacao extends PanacheEntity {

    @Column(name="tipo_gratificacao", nullable = false)
    public TipoGratificacao tipo;

    @Column(name = "nome_premiacao", length = 100, nullable = false)
    public String nomePremiacao;

    public String descricao;

    @Column(name="data_recebimento", nullable = false)
    public LocalDate dataRecebimento;

    @NotNull(message = "É necessário informar a qual motoqueiro recebeu a premiação")
    @ManyToOne
    @JoinColumn(nullable = false)
    public Motoqueiro motoqueiroRecebedor;

    /**
     * Busca todas as premiações concedidas ao motoqueiro por seu cpf
     * @param cpf do {@link Motoqueiro}
     * @return {@link List} de {@link Gratificacao} que o motoqueiro recebeu
     */
    public List<Gratificacao> buscarPremiacoesMotoqueiro(final String cpf){
        return Gratificacao.list("motoqueiro.cpf", cpf);
    }
}
