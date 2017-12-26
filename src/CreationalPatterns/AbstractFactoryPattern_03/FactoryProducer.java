package CreationalPatterns.AbstractFactoryPattern_03;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/22  11:25
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Class<? extends AbstractFactory> clazz){
        AbstractFactory factory=null;
        try {
            factory = (AbstractFactory) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }
}
