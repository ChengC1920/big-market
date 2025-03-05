package cn.thc.domain.activity.service.quota;

import cn.thc.domain.activity.model.entity.ActivityCountEntity;
import cn.thc.domain.activity.model.entity.ActivityEntity;
import cn.thc.domain.activity.model.entity.ActivitySkuEntity;
import cn.thc.domain.activity.repository.IActivityRepository;
import cn.thc.domain.activity.service.quota.rule.factory.DefaultActivityChainFactory;

/**
 * @author Ninetee Tang
 * @description 抽奖活动的支撑类
 * @create 2025/3/4 18:03
 */
public class RaffleActivityAccountQuotaSupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivityAccountQuotaSupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}

