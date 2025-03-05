package cn.thc.domain.award.service;

import cn.thc.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @author Ninetee Tang
 * @description 奖品服务接口
 * @create 2025/3/6 1:47
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}

