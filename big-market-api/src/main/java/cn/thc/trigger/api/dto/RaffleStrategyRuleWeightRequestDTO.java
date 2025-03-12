package cn.thc.trigger.api.dto;

import lombok.Data;

/**
 * @author Ninetee Tang
 * @description 抽奖策略规则，权重配置，查询N次抽奖可解锁奖品范围，请求对象
 * @create 2025/3/13 4:28
 */
@Data
public class RaffleStrategyRuleWeightRequestDTO {

    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}

