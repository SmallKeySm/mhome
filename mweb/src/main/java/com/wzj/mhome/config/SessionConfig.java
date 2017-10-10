package com.wzj.mhome.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@Configuration
@EnableSpringHttpSession
public class SessionConfig {

    @Bean
    public HashMapSessionRepository sessionRepository(){
        HashMapSessionRepository hashMapSessionRepository = new HashMapSessionRepository();
        return hashMapSessionRepository;
    }
}
