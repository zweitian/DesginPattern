package StrategyPattern_02;

/**
 * @Author:ztian
 * @Description:正常收费策略
 * @CreateTime: 2017/12/8  0:26
 */
public class CashNormal implements CashAlgorithm{
    @Override
    public double acceptCash(double totalMoney) {
        return totalMoney;
    }
}
