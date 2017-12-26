package StructuralPatterns.CompositePattern_14;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  20:03
 */
public class File extends Component{
    public File(String name) {
        super(name);
    }
    @Override
    public void add(Component component) {
        //do nothing
    }

    @Override
    public void remove(Component component) {
        //do nothing
    }

    @Override
    public void killVirus() {
        System.out.printf("对文件%s进行杀毒%n",this.getName());
    }
}
