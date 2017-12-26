package StructuralPatterns.FlyweightPattern_19;

/**
 * @Author:ztian
 * @Description:
 * @CreateTime: 2017/12/21  15:13
 */
public class ClubCard extends Card{
    private String color = "草花";
    public void showCards(String num) {
        System.out.println("Card[牌色=" + color + ",牌数=" + num + "]");
    }
}
