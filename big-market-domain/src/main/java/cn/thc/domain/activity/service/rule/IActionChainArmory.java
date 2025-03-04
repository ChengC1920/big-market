package cn.thc.domain.activity.service.rule;

/**
 * @author Ninetee Tang
 * @description
 * @create 2025/3/4 18:06
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}

