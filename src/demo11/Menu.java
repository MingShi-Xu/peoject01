package demo11;


import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.print();
        menu.option();
    }

    public void print() {
        System.out.println("欢迎使用菜单管理系统");
        System.out.println("-------------------");
        System.out.println("1.第一项");
        System.out.println("2.第二项");
        System.out.println("3.第三项");
        System.out.println("0.退出");
        System.out.println("请输入:");
    }

    public void option() {
        Scanner scanner = new Scanner(System.in);
        String menuNum = scanner.next();
        while ((!menuNum.equals("0")) && (!menuNum.equals("1")) && (!menuNum.equals("2")) && (!menuNum.equals("3"))) {
            System.out.println("输入错误，请重新输入：");
            menuNum = scanner.next();
        }
        switch (Integer.parseInt(menuNum)) {
            case 1:
                firstMenu();
                break;
            case 2:
                secondMenu();
                break;
            case 3:
                thirdMenu();
                break;
            case 0:
                System.out.println("欢迎下次使用，再见");
                return;
        }
    }

    public void firstMenu() {
        System.out.println("1.分菜单第一项");
        System.out.println("2.分菜单第二项");
        System.out.println("3.分菜单第三项");
        System.out.println("0.返回上一级");
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        String firstSubMenu = scanner.next();
        while ((!firstSubMenu.equals("0")) && (!firstSubMenu.equals("1")) && (!firstSubMenu.equals("2")) && (!firstSubMenu.equals("3"))) {
            System.out.print("您的输入有误，请重新输入:");
            firstSubMenu = scanner.next();
        }
        switch (Integer.parseInt(firstSubMenu)) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                print();
                option();
        }
    }

    public void secondMenu() {
        System.out.println("1.分菜单第一项");
        System.out.println("2.分菜单第二项");
        System.out.println("0.返回上一级");
        Scanner scanner = new Scanner(System.in);
        String secondSubMenu = scanner.next();
        while ((!secondSubMenu.equals("0")) && (!secondSubMenu.equals("1")) && (!secondSubMenu.equals("2"))) {
            System.out.println("您的输入有误，请重新输入:");
            secondSubMenu = scanner.next();
        }
        switch (Integer.parseInt(secondSubMenu)) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                print();
                option();
        }
    }

    public void thirdMenu() {
        System.out.println("0.返回上一级");
        Scanner scanner = new Scanner(System.in);
        String thirdSubMenu = scanner.next();
        while (!thirdSubMenu.equals("0")) {
            System.out.println("您的输入有误，请重新输入:");
            thirdSubMenu = scanner.next();
        }
        switch (Integer.parseInt(thirdSubMenu)) {
            case 0:
                print();
                option();
        }
    }
}
