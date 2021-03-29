package com.bcp.bootcamp.shopvintage.bidders.application.services.impl;

import com.bcp.bootcamp.shopvintage.bidders.application.services.BiddersApplicationService;
import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.Bidders;
import com.bcp.bootcamp.shopvintage.bidders.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiddersApplicationServiceImpl implements BiddersApplicationService {

    @Autowired
    private BiddersRepository biddersRepository;

    @Override
    public List<Bidders> findAll() {
        return this.biddersRepository.findAll();
    }

    @Override
    public Bidders save(Bidders bidder) {
        return this.biddersRepository.save(bidder);
    }

    @Override
    public Bidders update(Integer bidderId, Bidders bidder) {
        var bidderSaved = this.biddersRepository.findById(bidderId);
        if(bidderSaved.isPresent()){
//            bidderSaved.get().setCountry(bidder.getCountry());
//            bidderSaved.get().setEmail(bidder.getEmail());
//            bidderSaved.get().setName(bidder.getName());
//            bidderSaved.get().setPassword(bidder.getPassword());
//            bidderSaved.get().setType(bidder.getType());

            bidder.setId(bidderId);
            return this.biddersRepository.save(bidder);
        }

        return null;

    }
}
