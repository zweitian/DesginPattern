package CompositePattern_14;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  20:02
 */
public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void killVirus();
}
