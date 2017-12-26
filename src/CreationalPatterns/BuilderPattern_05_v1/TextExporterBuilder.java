package CreationalPatterns.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:15
 */
public class TextExporterBuilder implements ExportBuilder{
    private StringBuffer buffer=new StringBuffer();
    @Override
    public void buildHeader(String headerData) {
        buffer.append(String.format("Txt文件头部%s\n",headerData));
    }

    @Override
    public void buildBody(String bodyData) {
        buffer.append(String.format("Txt文件body部%s\n",bodyData));
    }

    @Override
    public void buildFooter(String footerData) {
        buffer.append(String.format("Txt文件尾部%s",footerData));
    }

    public String getResult() {
        return this.buffer.toString();
    }
}
