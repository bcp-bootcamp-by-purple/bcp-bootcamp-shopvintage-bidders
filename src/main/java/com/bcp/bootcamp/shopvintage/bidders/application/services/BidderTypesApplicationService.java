package com.bcp.bootcamp.shopvintage.bidders.application.services;

import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.BidderType;
import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.Bidders;

import java.util.List;

public interface BidderTypesApplicationService {
    List<BidderType> findAll();
}
