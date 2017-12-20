package CommondPattern_17;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:33
 */
public class TvChangeCommond implements TvCommond{
    private Tv tv;
    public TvChangeCommond(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.changeChanel();
    }
}
