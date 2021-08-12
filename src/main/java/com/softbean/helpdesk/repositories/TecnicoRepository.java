package com.softbean.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.softbean.helpdesk.domain.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
