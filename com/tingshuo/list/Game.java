package com.tingshuo.list;

import java.util.*;

//斗地主做牌
public class Game {
    public static final List<Card> all_card = new ArrayList<>();// 一副牌
    static {
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K","A", "2"};
        int index = 0;
        for (String n : nums) {
            for (String c : colors) {
                Card card = new Card(n, c, index++);
                all_card.add(card);
            }
        }
        Collections.addAll(all_card, new Card("","小王",index+1), new Card("","大王",index+1));
        System.out.println(all_card);
    }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(all_card);// 打乱牌的顺序
        System.out.println(all_card);
        //发牌
        List<Card> p1 = new ArrayList<Card>();
        List<Card> p2 = new ArrayList<Card>();
        List<Card> p3 = new ArrayList<Card>();
        List<Card> dp = new ArrayList<>();
        for (int i = 0; i < all_card.size(); i++) {
            if (i >= all_card.size() - 3) {
                dp.add(all_card.get(i));
            } else if (i % 3 == 0) {
                p1.add(all_card.get(i));
            } else if (i % 3 == 1) {
                p2.add(all_card.get(i));
            } else if (i % 3 == 2) {
                p3.add(all_card.get(i));
            }
        }
        //排序;

        sortCard(p1);
        sortCard(p2);
        sortCard(p3);

        //看牌
        System.out.println("韩爷牌 = " + p1);
        System.out.println("硕孙牌 = " + p2);
        System.out.println("逗逼牌 = " + p3);
        System.out.println("dp = " + dp);


    }

    private static void sortCard(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getValue() - o1.getValue();
            }
        });
    }
}
