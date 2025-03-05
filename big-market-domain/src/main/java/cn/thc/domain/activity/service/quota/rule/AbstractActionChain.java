package cn.thc.domain.activity.service.quota.rule;

/**
 * @author Ninetee Tang
 * @description 下单规则责任链抽象类
 * @create 2025/3/4 18:06
 */
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}

