package com.devsuperios.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	List<Sale> findAll();

}