package ObservePattern_09;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/19  0:17
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
