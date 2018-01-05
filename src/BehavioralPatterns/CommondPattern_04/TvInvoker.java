package BehavioralPatterns.CommondPattern_04;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:36
 */
public class TvInvoker {
    private TvCommond closeCommond;
    private TvCommond openCommond;
    public void closeTv(){
        this.closeCommond.execute();
    }
    public void openTv(){
        this.openCommond.execute();
    }
    public void setCloseCommond(TvCommond closeCommond) {
        this.closeCommond = closeCommond;
    }
    public void setOpenCommond(TvCommond openCommond) {
        this.openCommond = openCommond;
    }
}
