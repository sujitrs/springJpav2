package com.sj.spring.jpa.springJpa.model;

import java.util.HashMap;
import java.util.Map;

public enum UserStatusEnum {
    ENABLED(0),
    LOCKED(1),
    CREDS_EXPIRED(2);

    private int value;
    private static Map map = new HashMap<>();

    private UserStatusEnum(int value) {
        this.value = value;
    }

    static {
        for (UserStatusEnum userStatus : UserStatusEnum.values()) {
            map.put(userStatus.value, userStatus);
        }
    }

    public static UserStatusEnum valueOf(int userStatus) {
        return (UserStatusEnum) map.get(userStatus);
    }

    public int getValue() {
        return value;
    }
}