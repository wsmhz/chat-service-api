package com.wsmhz.chat.chat.service.api.domain.vo;

import com.wsmhz.chat.chat.service.api.domain.form.ChatMsgForm;
import lombok.*;

import java.util.List;

/**
 * Created By tangbj On 2019/6/13
 * Description:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnSignMsgVo {

    /**
     * 聊天内容
     */
    private List<ChatMsgForm.MsgContext> msgContexts;
    /**
     * 需要签收的消息ID
     */
    private List<String> signMsgIds;
}
