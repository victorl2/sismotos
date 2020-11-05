package br.com.sismotos.service.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = NovoMotoqueiroValidator.class)
@Target({METHOD,PARAMETER})
@Retention(RUNTIME)
@Documented
public @interface NovoMotoqueiroValido {
    String message() default "Novo motoqueiro invalido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
