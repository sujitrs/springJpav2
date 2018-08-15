package com.sj.spring.jpa.springJpa.model;
import java.util.HashMap;
import java.util.Map;

public enum FirstLoginFlagEnum {
    YES(0),
    NO(1);

    private int value;
    private static Map map = new HashMap<>();

    private FirstLoginFlagEnum(int value) {
        this.value = value;
    }

    static {
        for (FirstLoginFlagEnum firstLoginFlagEnum : FirstLoginFlagEnum.values()) {
            map.put(firstLoginFlagEnum.value, firstLoginFlagEnum);
        }
    }

    public static FirstLoginFlagEnum valueOf(char firstLoginFlagEnum) {
        return (FirstLoginFlagEnum) map.get(firstLoginFlagEnum);
    }

    public int getValue() {
        return value;
    }
}