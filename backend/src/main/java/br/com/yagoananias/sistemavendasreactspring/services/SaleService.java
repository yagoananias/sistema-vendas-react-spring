package br.com.yagoananias.sistemavendasreactspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.yagoananias.sistemavendasreactspring.dto.SaleDTO;
import br.com.yagoananias.sistemavendasreactspring.entities.Sale;
import br.com.yagoananias.sistemavendasreactspring.repositories.SaleRepository;
import br.com.yagoananias.sistemavendasreactspring.repositories.SellerRepository;


@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}
