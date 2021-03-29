package com.bcp.bootcamp.shopvintage.bidders.web.controllers;

import com.bcp.bootcamp.shopvintage.bidders.application.services.BidderTypesApplicationService;
import com.bcp.bootcamp.shopvintage.bidders.application.services.BiddersApplicationService;
import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.BidderType;
import com.bcp.bootcamp.shopvintage.bidders.persistence.entities.Bidders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bidders")
public class BiddersController {

    @Autowired
    private BiddersApplicationService biddersApplicationService;

    @Autowired
    private BidderTypesApplicationService bidderTypesApplicationService;

    @GetMapping
    public List<Bidders> findALl(){
        return this.biddersApplicationService.findAll();
    }

    @PostMapping
    public Bidders save(@RequestBody Bidders bidder){
        System.out.println("bidder = " + bidder);
        return this.biddersApplicationService.save( bidder);
   }

    @PutMapping("/{id}")
    public Bidders update( @PathVariable("id") Integer bidderId, @RequestBody Bidders bidder){
        return this.biddersApplicationService.update( bidderId, bidder);
    }

    @GetMapping("/types")
    public List<BidderType> findALlTypes(){
        return this.bidderTypesApplicationService.findAll();
    }
}
