package cn.thc.domain.strategy.service.rule.chain;

/**
 * @author Ninetee Tang
 * @description
 * @create 2025/1/21 0:44
 */
public abstract class AbstractLogicChain implements ILogicChain {

    private ILogicChain next;

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    @Override
    public ILogicChain next() {
        return next;
    }

    protected abstract String ruleModel();
}
