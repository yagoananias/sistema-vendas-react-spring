package br.com.yagoananias.sistemavendasreactspring.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yagoananias.sistemavendasreactspring.dto.SellerDTO;
import br.com.yagoananias.sistemavendasreactspring.entities.Seller;
import br.com.yagoananias.sistemavendasreactspring.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
