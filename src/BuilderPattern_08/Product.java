package BuilderPattern_08;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  22:53
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;
    public String getPartA() {
        return partA;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
