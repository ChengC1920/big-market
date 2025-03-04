package cn.thc.domain.activity.service;

import cn.thc.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @author Ninetee Tang
 * @description 抽奖活动服务
 * @create 2025/3/4 15:20
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity {

    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }

}

