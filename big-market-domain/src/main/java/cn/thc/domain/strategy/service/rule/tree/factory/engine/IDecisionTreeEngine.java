package cn.thc.domain.strategy.service.rule.tree.factory.engine;

import cn.thc.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

import java.util.Date;

/**
 * @author Ninetee Tang
 * @description 决策树引擎接口
 * @create 2025/1/21 14:37
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId, Date endDateTime);

}
