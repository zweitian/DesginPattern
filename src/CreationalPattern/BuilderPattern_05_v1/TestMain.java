package CreationalPattern.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:构建者模式
 * @定义：把一个复杂对象的构建与它的表示分离，使得同样的构建过程根据builder具体实现的不同而有表示
 * @本质：分离整体构建算法和部分的构建
 * @CreateTime: 2017/12/18  22:59
 */
public class TestMain {
    public static void main(String[] args) {

        //信息头部内容
        ExportHeaderModel headerModel=new ExportHeaderModel("header information");
        //信息身体内容
        ExportDataModel dataModel=new ExportDataModel("body information");
        //信息尾部内容
        ExportFooterModel footerModel=new ExportFooterModel("footer information");
        TextExporterBuilder textBuilder=new TextExporterBuilder();
        Director director=new Director(textBuilder);
        System.out.println("txtBuilder构建出的内容为:");
        System.out.println(director.construct(headerModel,dataModel,footerModel));
        //xml builder
        XmlExporterBuilder xmlBuilder=new XmlExporterBuilder();
        //更改委托的builder类
        director.setBuilder(xmlBuilder);
        System.out.println("xmlBuilder构建出的内容为:");
        System.out.println(director.construct(headerModel,dataModel,footerModel));
    }
}
