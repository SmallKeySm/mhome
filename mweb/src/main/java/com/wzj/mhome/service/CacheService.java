package com.wzj.mhome.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "cacheTest")
    public String getName(){
        return String.valueOf(System.currentTimeMillis());
    }
}
