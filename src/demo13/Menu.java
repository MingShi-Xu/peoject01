package demo13;

import java.util.Scanner;

public class Menu {
    private static final int MAIN_MENU_NUM = 5;
    private String menu[] = new String[MAIN_MENU_NUM];

    public static void main(String[] args) {
        System.out.println("当前根菜单一共" + MAIN_MENU_NUM + "项");
        Menu menus = new Menu();
        menus.createMenu();
        switch (menus.scanOptionNum()){
            case 0 :
                return;
            case 1:
                menus.createSubMenu();
                break;
            case 2 :
                menus.createSubMenu();
                break;
            case 3 :
                menus.createSubMenu();
                break;
            case 4:
                menus.createSubMenu();
                break;
        }
    }

    public int scanOptionNum(){
        System.out.println("请输入要生成子菜单的目录序号：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String[] createMenu(){
        menu[0] = "退出";     //默认第一项输入0退出
        for (int i = 1; i < MAIN_MENU_NUM; i++){
            System.out.println("请输入第" + i + "项目录名称：");
            Scanner scannerMenuName = new Scanner(System.in);
            String menuName = scannerMenuName.next();
            menu[i] = menuName;
        }
        System.out.println("生成的菜单为：");
        System.out.println(0 + "." + menu[0]);
        for (int j = 1; j < menu.length; j++){
            System.out.println(j + "." + menu[j]);
        }
        return menu;
    }

    public String[] createSubMenu(){
        System.out.println("请输入要创建的子目录数：");
        Scanner scanner = new Scanner(System.in);
        int subMenuNum = scanner.nextInt();
        while (subMenuNum < 0){
            System.out.println("输入错误，请重新输入：");
            subMenuNum = scanner.nextInt();
        }
        String[] subMenu = new String[subMenuNum];
        subMenu[0] = "返回上一级";
        for (int i = 1; i < subMenuNum; i++){
            System.out.println("请输入第" + i + "项目录名称：");
            String subMenuName = scanner.next();
            subMenu[i] = subMenuName;
        }
        System.out.println("生成的子目录为：");
        for (int j = 0; j < subMenu.length; j++){
            System.out.println(j + "." + subMenu[j]);
        }
        return subMenu;
    }

}
