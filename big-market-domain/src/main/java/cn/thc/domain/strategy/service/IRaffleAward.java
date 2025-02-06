package cn.thc.domain.strategy.service;

import cn.thc.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description 策略奖品接口
 * @create 2025/2/6 23:05
 */
public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

}
