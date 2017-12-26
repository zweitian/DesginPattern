package CreationalPattern.FactoryPattern_02_v2;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/22  10:40
 */
public class ShapeFactory {
    public  Shape createShape(Class<? extends Shape> clazz){
        Shape shape=null;
        try {
            shape= (Shape) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
