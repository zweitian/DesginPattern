package CreationalPattern.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:15
 */
public class XmlExporterBuilder implements ExportBuilder{
    private StringBuffer buffer=new StringBuffer();
    @Override
    public void buildHeader(String headerData) {
        buffer.append("<?xml version='1.0' encoding='utf-8'?>\n");
        buffer.append(String.format("Xml文件头部%s\n",headerData));
    }

    @Override
    public void buildBody(String bodyData) {
        buffer.append(String.format("Xml文件身体部分%s\n",bodyData));

    }

    @Override
    public void buildFooter(String footerData) {
        buffer.append(String.format("Xml文件尾部%s\n",footerData));
    }
    public String getResult() {
        return this.buffer.toString();
    }
}
