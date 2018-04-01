package com.luanoliveira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luanoliveira.cursomc.domain.ItemOrder;

@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder, Integer>{

}
