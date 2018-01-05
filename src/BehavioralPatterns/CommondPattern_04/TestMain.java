package BehavioralPatterns.CommondPattern_04;

/**
 * @Author:ztian
 * @Description:命令模式
 * @定义：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，并对请求进行系列处理
 * @本质：封装请求，系列处理
 * @CreateTime: 2017/12/21  0:36
 */
public class TestMain {
    public static void main(String[] args) {
        //SonyTv为动作最终执行者
        Tv tv=new SonyTv();
        TvOpenCommond openCommond=new TvOpenCommond(tv);
        TvCloseCommond closeCommond=new TvCloseCommond(tv);
        //Invoker组装不同的请求
        TvInvoker tvInvoker=new TvInvoker();
        tvInvoker.setOpenCommond(openCommond);
        tvInvoker.setCloseCommond(closeCommond);
        tvInvoker.openTv();
        tvInvoker.closeTv();
        System.out.println("====参数化====");
        //关闭按钮接上打开电视命令对象，打开电视按钮接上关闭电视命令对象
        //不同按钮执行的功能由客户端组合，即为参数化
        tvInvoker.setOpenCommond(closeCommond);
        tvInvoker.setCloseCommond(openCommond);
        tvInvoker.openTv();
        tvInvoker.closeTv();
    }
}
