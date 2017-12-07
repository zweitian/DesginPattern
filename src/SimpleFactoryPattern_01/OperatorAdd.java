package SimpleFactoryPattern_01;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/7  23:23
 */
public class OperatorAdd extends Operator{

    @Override
    protected double getResult() {
        return numberA+numberB;
    }
}
