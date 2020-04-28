package demo07;

import java.util.Random;
import java.util.Scanner;

public class Practice05 {
    private static final int OKICHI_NUM = 5;
    private static final int NAKAGICHI_NUM = 15;
    private static final int KOKICHI_NUM = 30;
    private static final int AUSPICIOUS_NUM = 60;
    private static final int MOKICHI_NUM = 80;
    private static final int FIERCE_NUM = 95;
    private static final int RANDOM_NUM = 100;

    public static void main(String[] args) {
        System.out.print("任意输入开始，输入0退出:");
        Scanner sc = new Scanner(System.in);
        String scanner = sc.next();
        while(!scanner.equals("0")){
            Practice05 practice05 = new Practice05();
            int randomNum = randomNum();
            practice05.judge(randomNum);
            System.out.print("任意输入继续，输入0退出:");
            scanner = sc.next();
        }
            System.out.println("再见，欢迎下次使用");
    }
    public static int randomNum() {
        return new Random().nextInt(RANDOM_NUM);
    }

    public void judge(int randomNum) {
        if (randomNum < OKICHI_NUM) {
            System.out.println("大吉");
        } else if (randomNum < NAKAGICHI_NUM) {
            System.out.println("中吉");
        } else if (randomNum < KOKICHI_NUM) {
            System.out.println("小吉");
        } else if (randomNum < AUSPICIOUS_NUM) {
            System.out.println("吉");
        } else if (randomNum < MOKICHI_NUM) {
            System.out.println("末吉");
        } else if (randomNum < FIERCE_NUM) {
            System.out.println("凶");
        } else {
            System.out.println("大凶");
        }
    }
}
