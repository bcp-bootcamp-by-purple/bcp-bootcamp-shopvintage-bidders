package com.bcp.bootcamp.shopvintage.bidders.persistence.repositories;

import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.BidderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidderTypesRepository extends JpaRepository<BidderType, Integer> {
}
