package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping(path = "/inserir")
    public Pessoa Insere(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

}
