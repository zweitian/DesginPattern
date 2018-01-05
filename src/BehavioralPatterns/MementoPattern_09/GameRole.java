package BehavioralPatterns.MementoPattern_09;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  16:09
 */
public class GameRole {
    private int blood=100;
    private int atk=100;
    public GameStateMemento saveState(){
        System.out.println("进行角色状态保存");
        return new GameStateMemento(this.blood,this.atk);
    }
    public void recoveryState(GameMementoInterface memento){
        System.out.println("进行状态恢复");

        this.blood=((GameStateMemento)memento).getBlood();
        this.atk=((GameStateMemento)memento).getAtk();
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
    private static class GameStateMemento implements GameMementoInterface {
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
}
