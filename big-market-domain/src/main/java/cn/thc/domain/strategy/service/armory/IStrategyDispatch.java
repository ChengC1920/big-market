package cn.thc.domain.strategy.service.armory;

/**
 * @author Ninetee Tang
 * @description 策略抽奖调度
 * @create 2025/1/18 22:40
 */
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

}
