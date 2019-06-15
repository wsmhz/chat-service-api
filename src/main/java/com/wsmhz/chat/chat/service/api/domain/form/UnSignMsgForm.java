package com.wsmhz.chat.chat.service.api.domain.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * Created By tangbj On 2019/6/13
 * Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnSignMsgForm {

    @NotBlank(message = "receiverId不能为空")
    private String  receiverId;
}
