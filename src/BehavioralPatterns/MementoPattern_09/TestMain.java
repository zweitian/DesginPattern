package BehavioralPatterns.MementoPattern_09;

/**
 * @Author:ztian
 * @Description:备忘录模式
 * @定义：在不破坏封装性的前提下捕获对象内部状态，并在对象之外保存这个状态
 * @本质：保存和恢复对象内部状态，保存是手段，恢复是目的
 * @CreateTime: 2017/12/20  16:16
 */
public class TestMain {
    public static void main(String[] args) {
        //新建游戏角色
        GameRole gameRole=new GameRole();
        gameRole.showState();
        //状态管理器
        GameMementoManager stateManager=new GameMementoManager();
        //战斗前使用manager保存状态
        stateManager.setMemento(gameRole.saveState());
        //进行战斗
        gameRole.fight();
        //战斗后恢复保存的状态
        gameRole.recoveryState(stateManager.getMemento());
        gameRole.showState();
    }
}
