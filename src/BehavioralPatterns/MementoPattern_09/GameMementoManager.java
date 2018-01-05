package BehavioralPatterns.MementoPattern_09;

/**
 * @Author:ztian
 * @Description:保存游戏状态管理器
 * @CreateTime: 2017/12/20  16:15
 */
public class GameMementoManager {
    private GameMementoInterface memento;
    public GameMementoInterface getMemento() {
        return memento;
    }
    public void setMemento(GameMementoInterface memento) {
        this.memento = memento;
    }
}
