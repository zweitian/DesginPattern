package BehavioralPatterns.StrategyPattern_02;

/**
 * @Author:ztian
 * @Description:满多少减多少策略
 * @CreateTime: 2017/12/8  0:31
 */
public class CashReturn implements CashAlgorithm{
    private double moneyCondition;//满多少
    private double moneyReturn;//减多少
    public CashReturn(double moneyReturn, double moneyCondition) {
        this.moneyReturn = moneyReturn;
        this.moneyCondition = moneyCondition;
    }
    @Override
    public double acceptCash(double totalMoney) {
        return totalMoney-totalMoney/moneyCondition*moneyReturn;
    }
}
