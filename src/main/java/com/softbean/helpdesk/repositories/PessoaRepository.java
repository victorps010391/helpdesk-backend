package com.softbean.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softbean.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
