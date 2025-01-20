package cn.thc.domain.strategy.service.rule.chain.impl;

import cn.thc.domain.strategy.service.armory.IStrategyDispatch;
import cn.thc.domain.strategy.service.rule.chain.AbstractLogicChain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Ninetee Tang
 * @description 兜底
 * @create 2025/1/21 0:44
 */
@Slf4j
@Component("default")
public class DefaultLogicChain extends AbstractLogicChain {

    @Resource
    private IStrategyDispatch strategyDispatch;

    @Override
    public Integer logic(String userId, Long strategyId) {
        Integer awardId = strategyDispatch.getRandomAwardId(strategyId);
        log.info("抽奖责任链-默认处理 userId: {} strategyId: {} ruleModel: {} awardId: {}", userId, strategyId, strategyId, awardId);
        return awardId;
    }

    @Override
    protected String ruleModel() {
        return "default";
    }
}
