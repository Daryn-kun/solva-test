package com.daryn.solvatest.service;

import com.daryn.solvatest.entity.Limit;

import java.util.List;

public interface LimitService {
    List<Limit> findAllLimits();

    Limit saveLimit(Limit limit);
}
