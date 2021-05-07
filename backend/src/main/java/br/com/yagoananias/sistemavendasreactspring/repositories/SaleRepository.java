package br.com.yagoananias.sistemavendasreactspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yagoananias.sistemavendasreactspring.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
