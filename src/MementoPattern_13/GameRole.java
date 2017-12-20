package MementoPattern_13;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  16:09
 */
public class GameRole {
    private int blood=100;
    private int atk=100;
    public GameStateMemento saveState(){return new GameStateMemento(this.blood,this.atk);}
    public void recoveryState(GameStateMemento memento){
        System.out.println("进行状态恢复");
        this.blood=memento.getBlood();
        this.atk=memento.getAtk();
    }
    public void showState(){
        System.out.printf("角色血量为 %d%n",this.blood);
        System.out.printf("角色攻击为 %d%n",this.atk);
    }
    public void fight(){
        System.out.println("开始战斗");
        this.blood-=20;
        this.atk-=10;
        System.out.println("战斗结束");
        this.showState();
    }
}
