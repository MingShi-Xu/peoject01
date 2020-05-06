package demo11;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        TestMenu tm = new TestMenu();
        tm.print();
        tm.scanMenuNum();
    }
    public void print(){
        System.out.println("欢迎使用菜单管理系统");
        System.out.println("--------------------");
        System.out.println("请输入你要生成的菜单的数量和名称:");
    }
    public int scanMenuNum(){
        Scanner scanner = new Scanner(System.in);
        int menuNum = scanner.nextInt();
        for(int i = 0;i < menuNum; i++){
            System.out.println(i + "." + scanner.next());
        }
        return menuNum;
    }
    public void option(){
        Scanner scanner = new Scanner(System.in);
        int menuNumber = scanner.nextInt();
        while(menuNumber > scanMenuNum() || menuNumber < 0){
            System.out.println("输入错误，请重新输入：");
            menuNumber = scanner.nextInt();
        }
    }
    public void subMenuNum(){
        System.out.println("请输入子菜单数量和名称：");
        Scanner sc = new Scanner(System.in);
        int subMenuNum = sc.nextInt();
        for(int j = 0;j < subMenuNum; j++){
            System.out.println(j + "." + sc.next());
        }
    }
}
