package cn.thc.domain.rebate.service;

import cn.thc.domain.rebate.model.entity.BehaviorEntity;

import java.util.List;

/**
 * @author Ninetee Tang
 * @description 行为返利服务接口
 * @create 2025/3/13 0:31
 */
public interface IBehaviorRebateService {

    /**
     * 创建行为动作的入账订单
     *
     * @param behaviorEntity 行为实体对象
     * @return 订单ID
     */
    List<String> createOrder(BehaviorEntity behaviorEntity);

}
