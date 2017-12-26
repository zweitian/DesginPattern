package StructuralPatterns.BirgePattern_03;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  0:10
 */
public class Square extends Shape{
    @Override
    public void draw() {
        if(this.color!=null){
            System.out.printf("画出%s的正方形%n",this.color.getColor());
        }else{
            System.out.println("画出正方形");
        }
    }
}
