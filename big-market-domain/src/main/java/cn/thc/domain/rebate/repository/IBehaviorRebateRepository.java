package cn.thc.domain.rebate.repository;

import cn.thc.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import cn.thc.domain.rebate.model.valobj.BehaviorTypeVO;
import cn.thc.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description 行为返利服务仓储接口
 * @create 2025/3/13 0:40
 */
public interface IBehaviorRebateRepository {

    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);

}

