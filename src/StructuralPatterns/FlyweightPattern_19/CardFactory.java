package StructuralPatterns.FlyweightPattern_19;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:ztian
 * @Description:享元工厂
 * @CreateTime: 2017/12/21  15:15
 */
public class CardFactory {
    public static final int SPADE = 1;
    public static final int CLUB = 2;
    public static final int HEARTS = 3;
    public static final int DIAMONDS = 4;
    private static Map<Integer, Card> cards = new ConcurrentHashMap<Integer, Card>();
    private static CardFactory instance = new CardFactory();
    private CardFactory(){}
    public static CardFactory getInstance(){
        return instance;
    }

    public Card getCard(Integer color){
        if (cards.containsKey(color)){
            System.out.println("复用对象");
            return cards.get(color);
        }else {
            System.out.println("新建对象");
            Card card;
            switch (color){
                case SPADE: card = new SpadeCard();break;
                case CLUB: card = new ClubCard();break;
                case HEARTS:card = new HeartsCard();break;
                default:card = new DiamondsCard();break;
            }
            cards.put(color, card);
            return card;
        }
    }
}
