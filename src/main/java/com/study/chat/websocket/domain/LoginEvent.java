package com.study.chat.websocket.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class LoginEvent {
    private String sessionId;
    private String userId;
    private Date time;
}
