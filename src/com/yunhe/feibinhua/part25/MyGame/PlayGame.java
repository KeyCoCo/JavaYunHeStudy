package com.yunhe.feibinhua.part25.MyGame;
/**
 * 开始游戏
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PlayGame {
    public static void main(String[] args) {
        Card c=new Card();
        ArrayList<String> cards=c.makecard();
        System.out.println(cards);
        System.out.println("底牌为："+ Arrays.toString(c.downcard));
        c.DealCards(cards);//发牌
        System.out.println("玩家一:"+c.Player1);
        System.out.println("玩家二:"+c.Player2);
        System.out.println("玩家三:"+c.Player3);
        System.out.println("玩家四:"+c.Player4);
        System.out.println(cards.size());


    }
}
