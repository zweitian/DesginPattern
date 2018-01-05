package BehavioralPatterns.StrategyPattern_02;

/**
 * @Author:ztian
 * @Description:策略模式上下文类
 * @CreateTime: 2017/12/8  0:24
 */
public class CashContext {
    private CashAlgorithm algorithm;

    public CashContext(String algorithmName) {
        switch (algorithmName){
            case "正常收费":
                algorithm=new CashNormal();
                break;
            case "打8折":
                algorithm=new CashRebate(0.8);
                break;
            case "满10减3":
                algorithm=new CashReturn(3,10);
                break;
            default:
                algorithm=new CashNormal();
                break;
        }
    }
    public double acceptCash(double totalMoney){
        return algorithm.acceptCash(totalMoney);
    }

}
