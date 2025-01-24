package cn.thc.domain.strategy.service.rule.chain;

import cn.thc.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @author Ninetee Tang
 * @description 责任链接口
 * @create 2025/1/21 0:43
 */
public interface ILogicChain extends ILogicChainArmory {

    /**
     *  责任链接口
     * @param userId 用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);

}
