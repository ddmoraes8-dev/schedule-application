package br.com.sgd.schedule.repository;

import br.com.sgd.schedule.model.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<SellerEntity, String> {
}
