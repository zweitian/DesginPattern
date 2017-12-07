package SimpleFactoryPattern_01;

import java.util.Scanner;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/7  23:27
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字A:");
        double numberA = scan.nextDouble();
        System.out.println("请输入操作符:");
        String operatorStr = scan.next();
        System.out.println("请输入数字B:");
        double numberB= scan.nextDouble();
        //简单工厂根据操作字符串生成操作类对象
        Operator operator = OperatorFactory.createOperator(operatorStr);
        operator.setNumberA(numberA);
        operator.setNumberB(numberB);
        System.out.println("操作结果为:"+operator.getResult());

    }
}
