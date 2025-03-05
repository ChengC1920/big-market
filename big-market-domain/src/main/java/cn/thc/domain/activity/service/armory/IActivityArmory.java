package cn.thc.domain.activity.service.armory;

/**
 * @author Ninetee Tang
 * @description 活动装配预热
 * @create 2025/3/4 22:39
 */
public interface IActivityArmory {

    boolean assembleActivitySkuByActivityId(Long activityId);

    boolean assembleActivitySku(Long sku);

}

