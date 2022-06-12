package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.pet.dtos.PetRequest;
import br.com.treinaweb.adoteumpet.api.pet.dtos.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.services.PetService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/pets")
public class PetController {
    // para automatizar e deixarmos por conta do Spring atraves do IoC
    @Autowired
    private PetService petService;

    // anotação de requisição de dados do banco de dados
    @GetMapping
    public List<PetResponse> findAll() {
        return petService.findAll();
    }

    // anotação de criação de dados no banco
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PetResponse create(@RequestBody @Valid PetRequest petRequest) {
        return petService.create(petRequest);
    }

}
