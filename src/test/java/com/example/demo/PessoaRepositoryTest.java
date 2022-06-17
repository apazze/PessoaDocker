package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// com rollback
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest

// modifica no Banco da aplicação
//@SpringBootTest
class PessoaRepositoryTest {
    @Autowired
    PessoaRepository pessoaRepository;

    @BeforeEach
    void limpaBanco(){
        pessoaRepository.deleteAll();
    }

    @Test
    void deveInserir(){
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));
        pessoaRepository.save(new Pessoa("bla"));

        List<Pessoa> lista = pessoaRepository.findAll();
        Pessoa pessoa0 = lista.get(0);
        Pessoa pessoa1 = lista.get(1);
        Pessoa pessoa2 = lista.get(2);
        Pessoa pessoa3 = lista.get(3);

        assertThat(pessoaRepository.findAll().size()).isEqualTo(4);
        assertThat(pessoa0.getNome()).isEqualTo("bla");
        assertThat(pessoa1.getNome()).isEqualTo("bla");
        assertThat(pessoa2.getNome()).isEqualTo("bla");
        assertThat(pessoa3.getNome()).isEqualTo("bla");

    }

    @Test
    void deveExcluirTodosRegistros(){
        pessoaRepository.deleteAll();
        assertThat(pessoaRepository.findAll()).isEmpty();
    }

    @Test
    void deveConterUmRegistro(){
        pessoaRepository.save(new Pessoa("bla"));
        assertThat(pessoaRepository.findAll().size()).isEqualTo(1);
    }

}