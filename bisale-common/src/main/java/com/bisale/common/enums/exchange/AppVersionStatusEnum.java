package com.bisale.common.enums.exchange;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author guojunfeng
 * */
public enum AppVersionStatusEnum {
    MUST_UPDATE(1, "强更新"),
    CAN_UPDATE(2, "弱更新"),
    LATEST_UPDATE(3, "最新版本"),;

    private int code;
    private String name;

    private static final Map<String, AppVersionStatusEnum> map;
    static {
        map = new HashMap<>();
        for (AppVersionStatusEnum item : AppVersionStatusEnum.values()) {
            map.put(item.name, item);
        }
    }

    private AppVersionStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static int getValueByName(String name) {
        if (!map.containsKey(name)) {
            return -1;
        }

        return map.get(name).code;
    }

    public static String getNameByCode(int code) {
        for (String key : map.keySet()) {
            AppVersionStatusEnum item = map.get(key);
            if (item.code == code) {
                return item.name;
            }
        }

        return null;
    }

    public static List<String> getStatusNames() {
        return new ArrayList<>(map.keySet());
    }
}