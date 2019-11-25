package com.study.chat.websocket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class RoomParticipantCollection {
    private String roomId;

    @JsonProperty("collection")
    private List<RoomParticipant> roomParticipants;
}
