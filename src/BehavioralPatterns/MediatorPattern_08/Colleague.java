package BehavioralPatterns.MediatorPattern_08;

/**
 * @Author:ztian
 * @Description:抽象同事类
 * @CreateTime: 2018/1/5  22:48
 */
public abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public Mediator getMediator() {
        return mediator;
    }
}
