package cn.thc.domain.strategy.repository;

import cn.thc.domain.strategy.model.entity.StrategyAwardEntity;
import cn.thc.domain.strategy.model.entity.StrategyEntity;
import cn.thc.domain.strategy.model.entity.StrategyRuleEntity;
import cn.thc.domain.strategy.model.valobj.RuleTreeVO;
import cn.thc.domain.strategy.model.valobj.RuleWeightVO;
import cn.thc.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import cn.thc.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

import java.util.Date;
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

    /**
     * 缓存奖品库存
     *
     * @param cacheKey    key
     * @param awardCount  库存值
     */
    void cacheStrategyAwardCount(String cacheKey, Integer awardCount);

    /**
     * 缓存key、decr 方式扣减库存
     *
     * @param cacheKey 缓存key
     * @return 扣减结果
     */
    Boolean subtractionAwardStock(String cacheKey);
    /**
     * 缓存key、decr 方式扣减库存
     *
     * @param cacheKey 缓存key
     * @param endDateTime 活动结束时间
     * @return 扣减结果
     */
    Boolean subtractionAwardStock(String cacheKey, Date endDateTime);
    /**
     * 写入奖品库存消费队列
     *
     * @param strategyAwardStockKeyVO 对象值对象
     */
    void awardStockConsumeSendQueue(StrategyAwardStockKeyVO strategyAwardStockKeyVO);
    /**
     * 获取奖品库存消费队列
     */
    StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException;
    /**
     * 更新奖品库存消耗
     *
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     */
    void updateStrategyAwardStock(Long strategyId, Integer awardId);
    /**
     * 根据策略ID+奖品ID的唯一值组合，查询奖品信息
     *
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return 奖品信息
     */
    StrategyAwardEntity queryStrategyAwardEntity(Long strategyId, Integer awardId);

    /**
     * 查询策略ID
     *
     * @param activityId 活动ID
     * @return 策略ID
     */
    Long queryStrategyIdByActivityId(Long activityId);

    /**
     * 查询用户抽奖次数 - 当天的；策略ID:活动ID 1:1 的配置，可以直接用 strategyId 查询。
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 用户今日参与次数
     */
    Integer queryTodayUserRaffleCount(String userId, Long strategyId);


    Map<String, Integer> queryAwardRuleLockCount(String[] treeIds);

    Integer queryActivityAccountTotalUseCount(String userId, Long strategyId);

    List<RuleWeightVO> queryAwardRuleWeight(Long strategyId);
}
