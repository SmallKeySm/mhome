package com.wzj.base.data.service.impl;

import com.wzj.base.data.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService {

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public Object findAll() {
        return null;
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public int delete(Serializable serializable) {
        return 0;
    }
}
