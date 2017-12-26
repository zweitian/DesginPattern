package StructuralPatterns.BirgePattern_03;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:09
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        if(this.color!=null){
            System.out.printf("画出%s的圆形%n",this.color.getColor());
        }else{
            System.out.println("画出圆形");
        }
    }
}
