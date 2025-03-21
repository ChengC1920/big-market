package cn.thc.trigger.api.dto;

import lombok.Data;

/**
 * @author Ninetee Tang
 * @description 抽奖奖品列表，请求对象
 * @create 2025/2/6 22:47
 */
@Data
public class RaffleAwardListRequestDTO {

    // 抽奖策略ID
    @Deprecated
    private Long strategyId;
    // 活动ID
    private Long activityId;
    // 用户ID
    private String userId;

}

