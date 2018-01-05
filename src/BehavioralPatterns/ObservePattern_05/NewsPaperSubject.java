package BehavioralPatterns.ObservePattern_05;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2018/1/5  20:42
 */
public class NewsPaperSubject extends Subject{
    /**
     * 报纸的具体内容
     */
    private String content;
    /**
     * 获取报纸的具体内容
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }
    public void updateContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers();
    }
}
