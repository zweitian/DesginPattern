package BuilderPattern_08;

/**
 * @Author:ztian
 * @Description:根据builder创建具体对象的导演类
 * @CreateTime: 2017/12/18  22:57
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public Product construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        return this.builder.getResult();
    }
}
