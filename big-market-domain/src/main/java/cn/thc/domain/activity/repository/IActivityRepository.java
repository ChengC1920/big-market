package cn.thc.domain.activity.repository;

import cn.thc.domain.activity.model.aggregate.CreateOrderAggregate;
import cn.thc.domain.activity.model.entity.ActivityCountEntity;
import cn.thc.domain.activity.model.entity.ActivityEntity;
import cn.thc.domain.activity.model.entity.ActivitySkuEntity;
import cn.thc.domain.activity.model.valobj.ActivitySkuStockKeyVO;

import java.util.Date;

/**
 * @author Ninetee Tang
 * @description 活动仓储接口
 * @create 2025/3/4 15:21
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);

    void cacheActivitySkuStockCount(String cacheKey, Integer stockCount);

    boolean subtractionActivitySkuStock(Long sku, String cacheKey, Date endDateTime);

    void activitySkuStockConsumeSendQueue(ActivitySkuStockKeyVO activitySkuStockKeyVO);

    ActivitySkuStockKeyVO takeQueueValue();

    void clearQueueValue();

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

}

