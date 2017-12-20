package CommondPattern_17;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:36
 */
public class TvController {
    private TvCommond closeCommond;
    private TvCommond openCommond;
    private TvCommond changeCommond;
    public TvController() {
        Tv tv=new Tv();
        this.openCommond=new TvOpenCommond(tv);
        this.closeCommond=new TvCloseCommond(tv);
        this.changeCommond=new TvChangeCommond(tv);
    }

    public void closeTv(){
        this.closeCommond.execute();
    }
    public void openTv(){
        this.openCommond.execute();
    }
    public void changeTvChanel(){
        this.changeCommond.execute();
    }
    public TvCommond getCloseCommond() {
        return closeCommond;
    }

    public void setCloseCommond(TvCommond closeCommond) {
        this.closeCommond = closeCommond;
    }

    public TvCommond getOpenCommond() {
        return openCommond;
    }

    public void setOpenCommond(TvCommond openCommond) {
        this.openCommond = openCommond;
    }

    public TvCommond getChangeCommond() {
        return changeCommond;
    }

    public void setChangeCommond(TvCommond changeCommond) {
        this.changeCommond = changeCommond;
    }
}
