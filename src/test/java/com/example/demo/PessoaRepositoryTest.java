package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class PessoaRepositoryTest {
    @Autowired
    PessoaRepository pessoaRepository;

    @Test
    void deveInserir(){
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));
//        String nome = pessoaRepository.findById(2L).get().getNome();

        pessoaRepository.deleteAll();
        //System.out.println("NOME ======== " + nome);
    }

}