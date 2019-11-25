package com.study.chat.websocket.domain;

import lombok.Data;


@Data
public class ChattingMessage {
    private String roomId;
    private String userId;
    private String message;
}
