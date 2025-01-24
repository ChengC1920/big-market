package cn.thc.domain.strategy.service.rule.tree;

import cn.thc.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author Ninetee Tang
 * @description
 * @create 2025/1/21 14:27
 */
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue);

}
