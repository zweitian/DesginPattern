package BirgePattern_16;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:03
 */
public abstract class Shape {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
