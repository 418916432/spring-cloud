package com.bisale.common.enums.exchange;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author guojunfeng
 * */
public enum AppVersionSourceEnum {
    IOS(1, "iOS", "iOS"),
    ANDROID(2, "Android", "安卓");

    private int code;
    private String value;
    private String name;

    private static final Map<String, AppVersionSourceEnum> map;
    static {
        map = new HashMap<>();
        for (AppVersionSourceEnum item : AppVersionSourceEnum.values()) {
            map.put(item.name, item);
        }
    }

    private AppVersionSourceEnum(int code, String value, String name) {
        this.code = code;
        this.value = value;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValueByName(String name) {
        if (!map.containsKey(name)) {
            return null;
        }

        return map.get(name).value;
    }

    public static String getNameByValue(String value) {
        for (String key : map.keySet()) {
            AppVersionSourceEnum item = map.get(key);
            if (item.value.equals(value)) {
                return item.name;
            }
        }

        return null;
    }

    public static List<String> getSourceNames() {
        return new ArrayList<>(map.keySet());
    }
}