package cn.thc.trigger.api;

import cn.thc.trigger.api.dto.ActivityDrawRequestDTO;
import cn.thc.trigger.api.dto.ActivityDrawResponseDTO;
import cn.thc.types.model.Response;

/**
 * @author Ninetee Tang
 * @description 抽奖活动服务
 * @create 2025/2/6 22:46
 */
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request 请求对象
     * @return 返回结果
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

}

