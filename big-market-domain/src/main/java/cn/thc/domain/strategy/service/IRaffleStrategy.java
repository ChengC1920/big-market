package cn.thc.domain.strategy.service;

import cn.thc.domain.strategy.model.entity.RaffleAwardEntity;
import cn.thc.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @author Ninetee Tang
 * @description 抽奖策略接口
 * @create 2025/1/19 15:23
 */
public interface IRaffleStrategy {

    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);

}
