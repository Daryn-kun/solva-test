package com.daryn.solvatest.service.impl;

import com.daryn.solvatest.entity.Limit;
import com.daryn.solvatest.repository.LimitRepository;
import com.daryn.solvatest.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class LimitServiceImpl implements LimitService {

    private final LimitRepository limitRepository;

    @Autowired
    public LimitServiceImpl(LimitRepository limitRepository) {
        this.limitRepository = limitRepository;
    }

    @Override
    public List<Limit> findAllLimits() {
        return limitRepository.findAll();
    }

    @Override
    public Limit saveLimit(Limit limit) {
        if (limit.getLimitSum() == null) {
            limit.setLimitSum(new BigDecimal("1000")); // default
        }

        limit.setLimitDateTime(new Date());
        return limitRepository.save(limit);
    }
}
