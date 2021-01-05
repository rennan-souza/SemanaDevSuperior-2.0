package br.com.somenteparaestudosetestes.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.somenteparaestudosetestes.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	//Método para listar pedidos pendentes dos mais antigos para os mais novos
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ "WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();
	
}
