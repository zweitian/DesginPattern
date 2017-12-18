package BuilderPattern_08;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/18  22:54
 */
public abstract class Builder {
    protected Product product=new Product();
    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();
    protected Product getResult(){return product;}
}
