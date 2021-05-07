package br.com.yagoananias.sistemavendasreactspring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.yagoananias.sistemavendasreactspring.dto.SaleSuccessDTO;
import br.com.yagoananias.sistemavendasreactspring.dto.SaleSumDTO;
import br.com.yagoananias.sistemavendasreactspring.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new br.com.yagoananias.sistemavendasreactspring.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.yagoananias.sistemavendasreactspring.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
