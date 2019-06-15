package com.wsmhz.chat.chat.service.api.domain.form;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created By tangbj On 2019/6/12
 * Description: 消息接收类
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMsgForm {

    /**
     * 动作类型
     */
    @NotNull(message = "动作类型不能为空")
    private Integer action;
    /**
     * 聊天内容
     */
    @Valid
    @NotNull(message = "聊天内容不能为空")
    private MsgContext msgContext;
    /**
     * 需要签收的消息ID
     */
    private List<String> signMsgIds;

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class MsgContext {
        /**
         * 发送者的用户id
         */
        @NotBlank(message = "发送者的用户id不能为空")
        private String senderId;
        /**
         * 接受者的用户id
         */
        @NotBlank(message = "接受者的用户id不能为空")
        private String receiverId;
        /**
         * 消息标识 用于消息的签收
         */
        private String msgId;
        /**
         * 消息内容
         */
        private String context;
        /**
         * 消息类型
         *  1- 文本
         *  2- 图片
         *  3- 音频
         *  4- 视频
         */
        @Builder.Default
        private Integer msgType = 1;
    }
}
