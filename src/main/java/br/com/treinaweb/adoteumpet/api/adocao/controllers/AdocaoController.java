package br.com.treinaweb.adoteumpet.api.adocao.controllers;

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

import br.com.treinaweb.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.treinaweb.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.treinaweb.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.treinaweb.adoteumpet.api.adocao.service.AdocaoService;
import br.com.treinaweb.adoteumpet.core.repositories.AdocaoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/adocoes")
public class AdocaoController {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;

    @Autowired
    private AdocaoService adocaoService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdocaoResponse create(@RequestBody @Valid AdocaoRequest adocaoRequest) {
        var adocao = adocaoMapper.toModel(adocaoRequest);
        var createAdocao = adocaoRepository.save(adocao);
        return adocaoMapper.toResponse(createAdocao);
    }

    // metodo gerado com 'Generated delegate methods'
    @GetMapping
    public List<AdocaoResponse> findAll() {
        return adocaoService.findAll();
    }

}