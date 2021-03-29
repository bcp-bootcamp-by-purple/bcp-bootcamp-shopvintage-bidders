package com.bcp.bootcamp.shopvintage.bidders.application.services.impl;

import com.bcp.bootcamp.shopvintage.bidders.application.services.BidderTypesApplicationService;
import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.BidderType;
import com.bcp.bootcamp.shopvintage.bidders.persistence.repositories.BidderTypesRepository;
import com.bcp.bootcamp.shopvintage.bidders.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidderTypesApplicationServiceImpl implements BidderTypesApplicationService {

    @Autowired
    private BidderTypesRepository bidderTypesRepository;

    @Override
    public List<BidderType> findAll() {
        return this.bidderTypesRepository.findAll();
    }
}
