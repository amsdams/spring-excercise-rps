package com.study.chat.websocket.controller;

import com.study.chat.websocket.domain.LoginEvent;
import com.study.chat.websocket.repository.RoomRepository;
import com.study.chat.websocket.repository.SessionRepository;
import com.study.chat.websocket.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/monitor")
public class MonitorController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/users")
    public Map<String, String>  getAllUser() {
        return userRepository.getUsers();
    }

    @ResponseBody
    @RequestMapping("/sessions")
    public Collection<LoginEvent> getSessions() {
        return sessionRepository.getActiveSessions().values();
    }

    @ResponseBody
    @RequestMapping("/rooms")
    public Map<String, Set<String>> getRooms() {
        return roomRepository.getRooms();
    }
}
