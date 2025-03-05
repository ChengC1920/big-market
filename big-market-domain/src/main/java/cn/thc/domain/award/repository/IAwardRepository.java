package cn.thc.domain.award.repository;

import cn.thc.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @author Ninetee Tang
 * @description 奖品仓储服务
 * @create 2025/3/6 1:46
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}

