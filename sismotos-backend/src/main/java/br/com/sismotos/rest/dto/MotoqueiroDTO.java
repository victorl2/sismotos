package br.com.sismotos.rest.dto;

import br.com.sismotos.domain.motoqueiro.ContaBancaria;
import br.com.sismotos.domain.motoqueiro.Motoqueiro;

import javax.validation.Valid;

public class MotoqueiroDTO {
    public String cpf;
    public String nome;
    public String placaMoto;
    public String numeroConta;
    public String numeroAgencia;
    public String codigoBanco;

    public MotoqueiroDTO(@Valid Motoqueiro motoqueiro){
        this.cpf = motoqueiro.cpf;
        this.nome = motoqueiro.nome;
        this.placaMoto = motoqueiro.placaMoto;
        this.codigoBanco = motoqueiro.conta.codigoBanco;
        this.numeroConta = motoqueiro.conta.conta;
        this.numeroAgencia = motoqueiro.conta.agencia;
    }

    public Motoqueiro converter(){
        Motoqueiro motoqueiroConvertido = new Motoqueiro();
        motoqueiroConvertido.cpf = this.cpf;
        motoqueiroConvertido.nome = this.nome;
        motoqueiroConvertido.placaMoto = this.placaMoto;

        ContaBancaria conta = new ContaBancaria();
        conta.codigoBanco = this.codigoBanco;
        conta.conta = this.numeroConta;
        conta.agencia = this.numeroAgencia;

        motoqueiroConvertido.conta = conta;

        return motoqueiroConvertido;
    }
}
