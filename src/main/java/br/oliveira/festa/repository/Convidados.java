package br.oliveira.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.oliveira.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
