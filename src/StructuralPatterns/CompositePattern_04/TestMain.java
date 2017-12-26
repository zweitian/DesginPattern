package StructuralPatterns.CompositePattern_04;

/**
 * @Author:ztian
 * @Description:组合模式
 * @定义：把对象组合成树形结构以表示‘整体-部分’的关系，组合模式使客户端对单个对象与组合对象的使用具有一致性
 * 本质：统一叶子对象与组合对象
 * @CreateTime: 2017/12/20  20:11
 */
public class TestMain {
    public static void main(String[] args) {
        FileFloder root=new FileFloder("根目录");
        File file1=new File("根目录文件1");
        File file2=new File("根目录文件2");
        FileFloder second=new FileFloder("二级目录");
        root.add(file1);
        root.add(file2);
        root.add(second);
        File secondfile1=new File("二级目录文件1");
        File secondfile2=new File("二级目录文件2");
        File secondfile3=new File("二级目录文件3");
        second.add(secondfile1);
        second.add(secondfile2);
        second.add(secondfile3);
        //从根目录开始杀毒
        root.killVirus();
    }
}
