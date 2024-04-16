package com.daryn.solvatest.controller;

import com.daryn.solvatest.entity.Limit;
import com.daryn.solvatest.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/limit")
public class LimitController {
    private final LimitService limitService;

    @Autowired
    public LimitController(LimitService limitService) {
        this.limitService = limitService;
    }

    @GetMapping
    public List<Limit> findAllLimit(){
        return limitService.findAllLimits();
    }


    @PostMapping("/add")
    public Limit saveLimit(@RequestBody Limit limit){
        return limitService.saveLimit(limit);
    }

}
