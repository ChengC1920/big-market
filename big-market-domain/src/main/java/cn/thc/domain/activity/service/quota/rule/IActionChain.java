package cn.thc.domain.activity.service.quota.rule;

import cn.thc.domain.activity.model.entity.ActivityCountEntity;
import cn.thc.domain.activity.model.entity.ActivityEntity;
import cn.thc.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @author Ninetee Tang
 * @description 下单规则过滤接口
 * @create 2025/3/4 18:06
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}

