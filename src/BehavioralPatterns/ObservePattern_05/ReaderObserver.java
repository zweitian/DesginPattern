package BehavioralPatterns.ObservePattern_05;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  20:47
 */
public class ReaderObserver implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ReaderObserver(String name){
        this.name=name;
    }
    @Override
    public void update(Subject subject) {
        if(subject instanceof NewsPaperSubject){
            String content =((NewsPaperSubject) subject).getContent();
            System.out.printf("%s 读者获取到了报纸新内容: %s\n",this.name,content);
        }
    }
}
