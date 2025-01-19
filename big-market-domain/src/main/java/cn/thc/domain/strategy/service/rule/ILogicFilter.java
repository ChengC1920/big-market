package cn.thc.domain.strategy.service.rule;

import cn.thc.domain.strategy.model.entity.RuleActionEntity;
import cn.thc.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author Ninetee Tang
 * @description
 * @create 2025/1/19 15:33
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
