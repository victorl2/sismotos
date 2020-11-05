package br.com.sismotos.service.validations;

import br.com.sismotos.domain.motoqueiro.Motoqueiro;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Validator;

public class NovoMotoqueiroValidator implements ConstraintValidator<NovoMotoqueiroValido, Motoqueiro> {

    @Inject
    Validator validator;

    @Override
    public boolean isValid(Motoqueiro novoMotoqueiro, ConstraintValidatorContext context) {
        if(!validator.validate(novoMotoqueiro).isEmpty()){
            return false;
        }

        if(Motoqueiro.findByCpf(novoMotoqueiro.cpf).isPresent()){
            return false;
        }

        return true;
    }
}
