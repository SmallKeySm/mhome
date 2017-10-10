package com.wzj.mhome.config;

import org.springframework.session.MapSession;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;

import java.util.HashMap;
import java.util.Map;

public class HashMapSessionRepository implements SessionRepository {
    final Map<String, Session> sessions = new HashMap<>();

    @Override
    public Session createSession() {
        MapSession mapSession = new MapSession();
        sessions.put(mapSession.getId(), mapSession);
        return mapSession;
    }

    @Override
    public void save(Session session) {

    }

    @Override
    public Session getSession(String id) {
        return sessions.get(id);
    }

    @Override
    public void delete(String id) {
        sessions.remove(id);
    }
}
