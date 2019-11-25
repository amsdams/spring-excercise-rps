package com.study.chat.websocket.domain;

import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class RoomParticipant {
    private String roomId;
    private String userId;
    private boolean presented;
}
