package MementoPattern_13;

/**
 * @Author:ztian
 * @Description:保存游戏状态管理器
 * @CreateTime: 2017/12/20  16:15
 */
public class GameMementoManager {
    private GameStateMemento memento;
    public GameStateMemento getMemento() {
        return memento;
    }
    public void setMemento(GameStateMemento memento) {
        this.memento = memento;
    }
}
