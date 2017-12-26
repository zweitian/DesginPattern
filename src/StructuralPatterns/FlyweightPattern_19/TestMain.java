package StructuralPatterns.FlyweightPattern_19;

/**
 * @Author:ztian
 * @Description:利用共享技术有效共享大量细粒度对象
 * @CreateTime: 2017/12/21  15:17
 */
public class TestMain {
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
            CardFactory cardFactory = CardFactory.getInstance();
            Card card = cardFactory.getCard((int)(Math.random() * 4));
            int num = (int)(Math.random()*13) + 1;
            switch (num){
                case 11:card.showCards("J");break;
                case 12:card.showCards("Q");break;
                case 13:card.showCards("K");break;
                default:card.showCards(String.valueOf(num));break;
            }
        }
    }
}
