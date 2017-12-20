package MementoPattern_13;

/**
 * @Author:ztian
 * @Description:备忘录模式
 * @目的：在不破坏封装性的前提下在对象外部保存对象状态，可以在以后把对象恢复保存的状态
 * @CreateTime: 2017/12/20  16:16
 */
public class TestMain {
    public static void main(String[] args) {
        //新建游戏角色
        GameRole gameRole=new GameRole();
        gameRole.showState();
        //战斗前使用manager保存状态
        GameMementoManager stateManager=new GameMementoManager();
        stateManager.setMemento(gameRole.saveState());
        //进行战斗
        gameRole.fight();
        //战斗后恢复保存的状态
        gameRole.recoveryState(stateManager.getMemento());
        gameRole.showState();
    }
}
