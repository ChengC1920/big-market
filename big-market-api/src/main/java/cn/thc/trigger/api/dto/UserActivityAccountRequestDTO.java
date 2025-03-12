package cn.thc.trigger.api.dto;

import lombok.Data;

/**
 * @author Ninetee Tang
 * @description 用户活动账户请求对象
 * @create 2025/3/13 3:33
 */
@Data
public class UserActivityAccountRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
