package cn.thc.domain.award.model.aggregate;

import cn.thc.domain.award.model.entity.TaskEntity;
import cn.thc.domain.award.model.entity.UserAwardRecordEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ninetee Tang
 * @description 用户中奖记录聚合对象 【聚合代表一个事务操作】
 * @create 2025/3/6 1:45
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAwardRecordAggregate {

    private UserAwardRecordEntity userAwardRecordEntity;

    private TaskEntity taskEntity;

}

