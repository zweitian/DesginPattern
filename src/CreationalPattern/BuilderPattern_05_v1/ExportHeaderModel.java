package CreationalPattern.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:09
 */
/**
 * 描述输出到文件头的内容的对象
 */
public class ExportHeaderModel {
    private String headerData;

    public ExportHeaderModel(String headerData) {
        this.headerData = headerData;
    }

    public String getHeaderData() {
        return headerData;
    }

    public void setHeaderData(String headerData) {
        this.headerData = headerData;
    }
}