package br.com.somenteparaestudosetestes.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somenteparaestudosetestes.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
