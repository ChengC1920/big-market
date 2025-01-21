package cn.thc.domain.strategy.service.rule.tree.impl;

import cn.thc.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import cn.thc.domain.strategy.service.rule.tree.ILogicTreeNode;
import cn.thc.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Ninetee Tang
 * @description 次数锁节点
 * @create 2025/1/21 14:28
 */
@Slf4j
@Component("rule_lock")
public class RuleLockLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {

        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.ALLOW)
                .build();

    }
}
