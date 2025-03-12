package cn.thc.domain.strategy.service;

import java.util.Map;

/**
 * @author Ninetee Tang
 * @description 抽奖规则接口
 * @create 2025/3/12 16:05
 */
public interface IRaffleRule {

    Map<String, Integer> queryAwardRuleLockCount(String[] treeIds);

}
