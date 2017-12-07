package SimpleFactoryPattern_01;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/7  23:31
 */
public class OperatorFactory {
    public static Operator createOperator(String operator){
        Operator oper=null;
        switch (operator){
            case "+":
                oper=new OperatorAdd();
                break;
        }
        return oper;
    }
}
