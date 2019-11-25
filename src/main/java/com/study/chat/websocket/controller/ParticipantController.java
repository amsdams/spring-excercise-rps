package com.study.chat.websocket.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import com.study.chat.websocket.domain.RoomParticipantCollection;


@Controller
public class ParticipantController {
    @SubscribeMapping("/participants/room.{roomId}")
    public RoomParticipantCollection subscribeParticipants(@Payload RoomParticipantCollection message, @DestinationVariable String roomId) {
        return message;
    }
}
