package com.softbean.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softbean.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
