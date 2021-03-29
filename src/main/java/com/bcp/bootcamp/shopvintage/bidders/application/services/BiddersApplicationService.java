package com.bcp.bootcamp.shopvintage.bidders.application.services;

import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.Bidders;

import java.util.List;

public interface BiddersApplicationService {
    List<Bidders> findAll();
    Bidders save(Bidders bidder);
    Bidders update(Integer bidderId, Bidders bidder);
}
