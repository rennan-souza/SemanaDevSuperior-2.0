package br.com.somenteparaestudosetestes.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somenteparaestudosetestes.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	//Método para consultar todos os produtos ordenados por nome
	List<Product> findAllByOrderByNameAsc();
}
