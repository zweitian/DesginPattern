package FacadePattern_07;

/**
 * @Author:ztian
 * @Description:基金类
 * @CreateTime: 2017/12/18  21:55
 */
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private NationalDebt3 debt1;

    public Fund() {
        this.stock1 = new Stock1();
        this.stock2 =new Stock2();
        this.debt1 =new NationalDebt3();
    }

    public void sellAll(){
        stock1.sell();
        stock2.sell();
        debt1.sell();
    }
    public void buyAll(){
        stock1.buy();
        stock2.buy();
        debt1.buy();
    }
    public void sell12(){
        stock1.sell();
        stock2.sell();
    }
    public void buy12(){
        stock1.buy();
        stock2.buy();
    }
}
