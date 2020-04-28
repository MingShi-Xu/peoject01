package demo09;

import java.util.Random;

public class Card {
    private static final String[] FACE_VALUE = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static final String[] PATTERN_VALUE = {"红桃", "黑桃", "梅花", "方块"};
    private static final int TOTAL_CARDS = 54;
    private static final int LANDLORD_CARD_NUM = 20;
    private static final int FARMER_CARD_NUM = 17;
    private static final int GAME_PLAYER_NUM = 3;
    private String face;
    private String pattern;

    // 创建牌组
    public Card[] createCards() {
        Card[] cardArr = new Card[TOTAL_CARDS];
        int index = 0;
        for (int faceValue = 0; faceValue < FACE_VALUE.length; faceValue++) {
            for (int patternValue = 0; patternValue < PATTERN_VALUE.length; patternValue++) {
                Card cards = new Card(FACE_VALUE[faceValue], PATTERN_VALUE[patternValue]);
                cardArr[index] = cards;
                index++;
            }
        }
        cardArr[TOTAL_CARDS - 2] = new Card("小王");
        cardArr[TOTAL_CARDS - 1] = new Card("大王");
        return cardArr;
    }

    //洗牌
    public void clearCard(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(cards.length);
            Card temp = cards[randomNum];
            cards[randomNum] = cards[i];
            cards[i] = temp;
        }
    }

    // 发牌
    public void dealCard(Card[] cards) {
        int landlordIndex = 0;
        int farmer1Index = 0;
        int farmer2Index = 0;
        Card[] landlordCards = new Card[LANDLORD_CARD_NUM];
        Card[] farmer1Cards = new Card[FARMER_CARD_NUM];
        Card[] farmer2Cards = new Card[FARMER_CARD_NUM];
        for (int i = 0; i < (TOTAL_CARDS - GAME_PLAYER_NUM); i++) {
            if ((i % GAME_PLAYER_NUM) == 1) {
                farmer1Cards[farmer1Index] = cards[i];
                farmer1Index++;
            } else if ((i % GAME_PLAYER_NUM) == 2) {
                farmer2Cards[farmer2Index] = cards[i];
                farmer2Index++;
            } else {
                landlordCards[landlordIndex] = cards[i];
                landlordIndex++;
            }
            //三张底牌
            landlordCards[LANDLORD_CARD_NUM - 3] = cards[TOTAL_CARDS - 3];
            landlordCards[LANDLORD_CARD_NUM - 2] = cards[TOTAL_CARDS - 2];
            landlordCards[LANDLORD_CARD_NUM - 1] = cards[TOTAL_CARDS - 1];
        }
        for (int m = 0; m < landlordCards.length; m++) {
            System.out.print(landlordCards[m] + " ");
        }
        System.out.println("");
        for (int n = 0; n < farmer1Cards.length; n++) {
            System.out.print(farmer1Cards[n] + " ");
        }
        System.out.println("");
        for (int k = 0; k < farmer2Cards.length; k++) {
            System.out.print(farmer2Cards[k] + " ");
        }
    }

    public Card() {
    }

    public Card(String face) {
        this.face = face;
    }

    public Card(String face, String pattern) {
        this.face = face;
        this.pattern = pattern;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return this.getPattern() + this.getFace();
    }
}
