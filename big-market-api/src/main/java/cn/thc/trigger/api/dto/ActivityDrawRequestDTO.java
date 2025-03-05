package cn.thc.trigger.api.dto;

import lombok.Data;

/**
 * @author Ninetee Tang
 * @description 活动抽奖请求对象
 * @create 2025/3/6 5:09
 */
@Data
public class ActivityDrawRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}

