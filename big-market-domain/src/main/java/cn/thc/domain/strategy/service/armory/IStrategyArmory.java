package cn.thc.domain.strategy.service.armory;

/**
 * @author Ninetee Tang
 * @description 策略装配库(兵工厂),负责初始化策略计算
 * @create 2025/1/17 16:39
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置 【触发的时机可以为活动审核通过后进行调用】
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param activityId 活动ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategyByActivityId(Long activityId);

}
