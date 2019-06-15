package com.wsmhz.chat.chat.service.api.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created By tangbj On 2019/6/14
 * Description:
 */
public enum  MsgTypeEnum {

    TEXT(1, "文本"),
    IMAGE(2, "图片"),
    AUDIO(3, "音频"),
    VIDEO(4, "视频");

    private Integer id;
    private String desc;

    MsgTypeEnum(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public static Map<Integer, MsgTypeEnum> enumMap = new HashMap<>();

    static {
        for (MsgTypeEnum value : MsgTypeEnum.values()) {
            enumMap.put(value.id, value);
        }
    }

    public static MsgTypeEnum valueOf(Integer type) {
        return Optional.ofNullable(enumMap.get(type)).orElseThrow(() -> new IllegalArgumentException("未知的MsgTypeEnum类型：" + type + "!"));
    }
}
