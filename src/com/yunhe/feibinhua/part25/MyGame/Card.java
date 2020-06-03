package com.yunhe.feibinhua.part25.MyGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 牌堆
 */
public class Card {
    private String[] identification = {"♣", "♦", "♥", "♠"};//标识
    private String[] cardnum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    protected ArrayList<String> cards = new ArrayList<>();
    protected String[] downcard = {};//底牌

    public ArrayList makecard() {
        for (String i : identification) {
            for (String n : cardnum) {
                cards.add(i + n);
            }
        }
        cards.add("大王♚");
        cards.add("小王♚");
        Collections.shuffle(cards);//洗牌
        Random rand = new Random();//随机生成底牌
        int rand1 = rand.nextInt(54);
        int rand2 = rand.nextInt(54);
        downcard = new String[]{cards.get(rand1), cards.get(rand2)};
        cards.remove(rand1);
        cards.remove(rand2);

        return cards;
    }

    /**
     * 发牌器
     *
     * @return 牌组
     */
    protected ArrayList<String> Player1 = new ArrayList<>();
    protected ArrayList<String> Player2 = new ArrayList<>();
    protected ArrayList<String> Player3 = new ArrayList<>();
    protected ArrayList<String> Player4 = new ArrayList<>();

    protected ArrayList DealCards(ArrayList<String> cards) {
        for (int index = 0; index < cards.size(); index++) {
            String s = cards.get(index);
            if (index < 13) {
                Player1.add(s);
            }else if (index < 26) {
                Player2.add(s);
            }else if (index < 39) {
                Player3.add(s);
            }else if(index<52){
                Player4.add(s);
            }
        }
        cards.clear();//清空牌堆
        return Player1;
    }
}
