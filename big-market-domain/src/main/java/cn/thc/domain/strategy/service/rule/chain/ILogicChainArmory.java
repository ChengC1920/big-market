package cn.thc.domain.strategy.service.rule.chain;

/**
 * @author Ninetee Tang
 * @description 装配
 * @create 2025/1/21 1:29
 */
public interface ILogicChainArmory {

    ILogicChain appendNext(ILogicChain next);

    ILogicChain next();

}
