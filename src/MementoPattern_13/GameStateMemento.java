package MementoPattern_13;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  16:08
 */
public class GameStateMemento {
    private int blood;
    private int atk;
    public GameStateMemento(int blood, int atk) {
        this.blood = blood;
        this.atk = atk;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
}
