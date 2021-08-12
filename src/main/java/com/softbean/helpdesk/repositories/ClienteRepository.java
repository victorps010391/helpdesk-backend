package com.softbean.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softbean.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
