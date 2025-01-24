package cn.thc.domain.strategy.repository;

import cn.thc.domain.strategy.model.entity.StrategyAwardEntity;
import cn.thc.domain.strategy.model.entity.StrategyEntity;
import cn.thc.domain.strategy.model.entity.StrategyRuleEntity;
import cn.thc.domain.strategy.model.valobj.RuleTreeVO;
import cn.thc.domain.strategy.model.valobj.StrategyAwardRuleModelVO;

import java.util.List;
import java.util.Map;

/**
 * @author Ninetee Tang
 * @description 策略仓储接口
 * @create 2025/1/17 16:51
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    RuleTreeVO queryRuleTreeVOByTreeId(String treeLock);

}
