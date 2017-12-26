package CreationalPatterns.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:13
 */
public interface ExportBuilder {
    void buildHeader(String headerData);
    void buildBody(String bodyData);
    void buildFooter(String footerData);
    String getResult();
}
