package cn.thc.infrastructure.persistent.dao;

import cn.thc.infrastructure.persistent.po.RaffleActivityAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ninetee Tang
 * @description 抽奖活动账户表
 * @create 2025/3/4 4:40
 */
@Mapper
public interface IRaffleActivityAccountDao {

    void insert(RaffleActivityAccount raffleActivityAccount);

    int updateAccountQuota(RaffleActivityAccount raffleActivityAccount);

}
