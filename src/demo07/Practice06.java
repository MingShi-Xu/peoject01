package demo07;

import java.util.Random;
import java.util.Scanner;

public class Practice06 {
    private static final int EASY_HARD_RANDOM_NUM= 10;
    private static final int MID_HARD_RANDOM_NUM = 100;
    private static final int HIGH_HARD_RANDOM_NUM = 1000;
    private static final int GAME_GRADE_MAX = 3;
    private static final int GAME_GRADE_MIN = 0;

    public static void main(String[] args) {
        Practice06 p = new Practice06();
        p.print();
        p.option();
    }

    public  int easyHardRandom() {
        Random random = new Random();
        int easyHardRandomNum = random.nextInt(EASY_HARD_RANDOM_NUM );
        return easyHardRandomNum;
    }

    public  int midHardRandom(){
        Random random = new Random();
        int midHardRandomNum = random.nextInt(MID_HARD_RANDOM_NUM );
        return  midHardRandomNum;
    }
    public int highHardRandom(){
        Random random = new Random();
        int highHardRandom = random.nextInt(HIGH_HARD_RANDOM_NUM);
        return highHardRandom;
    }
    public  void print() {
        System.out.println("请选择游戏难度：");
        System.out.println("1.0-9");
        System.out.println("2.0-99");
        System.out.println("3.0-999");
        System.out.println("0.退出");
    }

    public void option() {
        Scanner scanner = new Scanner(System.in);
        int gameGrade = scanner.nextInt();
        while (gameGrade > GAME_GRADE_MAX || gameGrade < GAME_GRADE_MIN) {
            System.out.println("输入错误，请重新输入0-3之间的数：");
            gameGrade = scanner.nextInt();
        }
        switch (gameGrade) {
            case 1:
                easyHardGame();
                break;
            case 2:
                midHardGame();
                break;
            case 3:
                highHardGame();
                break;
            case 0:
                return;
        }

    }

    public  void guess(int random){
        System.out.println("请输入你要猜的次数：");
        Scanner times = new Scanner(System.in);
        int guessTimes = times.nextInt();
        for (int count = 0;count < guessTimes; count++) {
            System.out.println("请输入你要猜的数:");
            Scanner guessNum = new Scanner(System.in);
            int firstGuessNum = guessNum.nextInt();
            if (firstGuessNum > random) {
                if (count == guessTimes - 1) {
                    System.out.println("您的次数已用完，游戏失败！");
                    break;
                }
                System.out.println("猜大了，当前剩余次数:" + (guessTimes - count - 1) + " 请重新输入：");
            } else if (firstGuessNum < random) {
                if (count == guessTimes - 1) {
                    System.out.println("您的次数已用完，游戏失败！");
                    break;
                }
                System.out.println("猜小了，当前剩余次数:" + (guessTimes - count - 1) + " 请重新输入：");
            } else if (firstGuessNum == random) {
                System.out.println("恭喜你猜对了!");
                break;
            }

        }
    }
    public  void easyHardGame() {
        int num = easyHardRandom();
        System.out.println("要猜的数为：" + num);
        System.out.println("你当前选择的难度等级为0-9");
        guess(num);
    }

    public  void midHardGame() {
        int num = midHardRandom();
        System.out.println("要猜的数为：" + num);
        System.out.println("你当前选择的难度等级为0-99");
        guess(num);
    }

    public  void highHardGame() {
        int num = highHardRandom();
        System.out.println("要猜的数为：" + num);
        System.out.println("你当前选择的难度等级为0-999");
        guess(num);
    }
}
