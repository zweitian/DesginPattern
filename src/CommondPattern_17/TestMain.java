package CommondPattern_17;

/**
 * @Author:ztian
 * @Description:命令模式
 * @目的：通过命令把"行为请求者"与"行为实现者"解耦，对客户端隐藏真正的实现者
 * @CreateTime: 2017/12/21  0:36
 */
public class TestMain {
    public static void main(String[] args) {
        //参考controller的无参构造函数
        TvController controller=new TvController();
        controller.openTv();
        controller.changeTvChanel();
        controller.closeTv();
    }
}
