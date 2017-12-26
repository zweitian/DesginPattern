package StructuralPatterns.CompositePattern_04;

import java.util.ArrayList;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/20  20:08
 */
public class FileFloder extends Component {
    private ArrayList<Component> componentList=new ArrayList<Component>();
    public FileFloder(String name) {
        super(name);
    }
    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void killVirus() {
        System.out.printf("进入文件架%s%n",this.getName());
        for(Component component:componentList){
            component.killVirus();
        }
    }
}
