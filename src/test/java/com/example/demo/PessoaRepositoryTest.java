package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
// com rollback
/*@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest*/
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

        //System.out.println("NOME ======== " + nome);
    }

}