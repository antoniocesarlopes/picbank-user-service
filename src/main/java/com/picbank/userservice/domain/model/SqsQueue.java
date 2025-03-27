package com.picbank.userservice.domain.model;

import lombok.Getter;

@Getter
public enum SqsQueue {
    USER_DATA_REQUEST("user-data-requests"),
    USER_DATA_RESPONSE("user-data-response"),
    USER_CREATED_NOTIFICATION("user-created-notification");

    private final String key;

    SqsQueue(String key) {
        this.key = key;
    }
}
