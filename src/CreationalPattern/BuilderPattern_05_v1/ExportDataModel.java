package CreationalPattern.BuilderPattern_05_v1;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/26  16:10
 */
public class ExportDataModel {
    private String bodyData;

    public ExportDataModel(String bodyData) {
        this.bodyData = bodyData;
    }

    public String getBodyData() {
        return bodyData;
    }

    public void setBodyData(String bodyData) {
        this.bodyData = bodyData;
    }
}
