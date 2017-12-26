package CreationalPatterns.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:09
 */
/**
 * 描述输出到文件尾的内容的对象
 */
public class ExportFooterModel {
    private String footerData;

    public ExportFooterModel(String footerData) {
        this.footerData = footerData;
    }

    public String getFooterData() {
        return footerData;
    }

    public void setFooterData(String footerData) {
        this.footerData = footerData;
    }
}