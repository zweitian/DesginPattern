package StrategyPattern_03;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/8  0:28
 */
public class CashRebate implements CashAlgorithm{
    //打折金额数
    private double rebateRate;
    public CashRebate(double rebateRate) {
        this.rebateRate = rebateRate;
    }
    @Override
    public double acceptCash(double totalMoney) {
        return totalMoney*rebateRate;
    }
}
