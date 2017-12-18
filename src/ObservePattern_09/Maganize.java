package ObservePattern_09;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:22
 */
public class Maganize implements Subject{
    private List<Observer> observers;
    private String flag;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int index=observers.indexOf(observer);
        if(index>-1) observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(this.flag);
        }
    }
    public void publishNewMaganize(String flag){
        this.flag = flag;
        System.out.println("publish new maganize: " + flag);
        notifyObservers();
    }
    public Maganize() {
        this.observers = new ArrayList<Observer>();
    }
}
