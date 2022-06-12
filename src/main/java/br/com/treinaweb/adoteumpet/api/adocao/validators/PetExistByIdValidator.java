package br.com.treinaweb.adoteumpet.api.adocao.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@Component
public class PetExistByIdValidator implements ConstraintValidator<PetExistById, Long> {

    @Autowired
    private PetRepository petRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        // a verificação para que veja se o valor e nulo, se for não precisaremos
        // executar
        // a validação e ja retornamos o true
        if (value == null) {
            return true;
        }
        // se não tiver valor null e pq recebemos um valor, então mandamos a pergunta
        // pro
        // back-end e se existir o valor o mesmo retornara true ou false, fazendo a
        // validação
        return petRepository.existsById(value);

    }
}
