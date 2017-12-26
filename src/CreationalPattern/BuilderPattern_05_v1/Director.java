package CreationalPattern.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:23
 */
public class Director {
    private ExportBuilder builder;

    public Director(ExportBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ExportBuilder builder) {
        this.builder = builder;
    }

    public Director() {
    }
    public String construct(ExportHeaderModel headerModel,ExportDataModel dataModel,ExportFooterModel footerModel) {
        //1：先构建Header
        builder.buildHeader(headerModel.getHeaderData());
        //2：然后构建Body
        builder.buildBody(dataModel.getBodyData());
        //3：然后构建Footer
        builder.buildFooter(footerModel.getFooterData());
        return this.builder.getResult();
    }
}
