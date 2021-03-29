package com.bcp.bootcamp.shopvintage.bidders.persistence.repositories;

import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.Bidders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiddersRepository extends JpaRepository<Bidders, Integer> {
}
