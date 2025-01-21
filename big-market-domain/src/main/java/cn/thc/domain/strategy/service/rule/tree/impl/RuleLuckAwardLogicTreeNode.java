package cn.thc.domain.strategy.service.rule.tree.impl;

import cn.thc.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import cn.thc.domain.strategy.service.rule.tree.ILogicTreeNode;
import cn.thc.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Ninetee Tang
 * @description 兜底奖励节点
 * @create 2025/1/21 14:30
 */
@Slf4j
@Component("rule_luck_award")
public class RuleLuckAwardLogicTreeNode implements ILogicTreeNode {
    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {

        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .strategyAwardData(DefaultTreeFactory.StrategyAwardData.builder()
                        .awardId(101)
                        .awardRuleValue("1,100")
                        .build())
                .build();

    }
}
