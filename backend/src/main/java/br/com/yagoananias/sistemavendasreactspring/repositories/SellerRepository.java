package br.com.yagoananias.sistemavendasreactspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yagoananias.sistemavendasreactspring.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
