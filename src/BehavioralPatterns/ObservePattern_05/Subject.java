package BehavioralPatterns.ObservePattern_05;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:17
 */
public class Subject {
    private List<Observer> observerList=new ArrayList<Observer>();
    protected void registerObserver(Observer observer){
        observerList.add(observer);
    };
    protected void removeObserver(Observer observer){
        observerList.remove(observer);
    };
    protected void notifyObservers(){
        for(Observer observer:observerList){
            observer.update(this);
        }
    };
}
