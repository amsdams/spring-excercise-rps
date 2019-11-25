package com.study.chat.websocket.repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;

import com.study.chat.websocket.domain.LoginEvent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class SessionRepository {
    @Getter
    private Map<String, LoginEvent> activeSessions = new ConcurrentHashMap<>();

    public void add(String sessionId, LoginEvent event) {
        activeSessions.put(sessionId, event);
    }

    public LoginEvent getParticipant(String sessionId) {
        return activeSessions.get(sessionId);
    }

    public void removeParticipant(String sessionId) {
        activeSessions.remove(sessionId);
    }
}
