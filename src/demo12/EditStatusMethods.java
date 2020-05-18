package demo12;

import java.util.Scanner;

public class EditStatusMethods {
    public static Menu initCurrentMenu() {
        //初始化一个当前目录
        int inputNum;//inputNum为当前目录子目录数
        Menu newMenu = new Menu();//当前目录
        newMenu.setLevel(CurrentMenu.currentLevel);//当前目录等级初始化
        newMenu.setName(CurrentMenu.currentName);//目录名初始化
        newMenu.setIdInFatherMenu(CurrentMenu.currentIdInFatherMenu);//当前目录在上一层目录中编号初始化
        while (true){
            System.out.println("请输入本级目录子目录数：");
            Scanner scanner = new Scanner(System.in);
            int input3 = scanner.nextInt();
            scanner.nextLine();
            if(input3 <= 0){
                System.out.println("输入不合法");
                continue;
            }
            inputNum = input3;
            break;
        }

        newMenu.setSubMenuCount(inputNum);//子目录数初始化
        Menu[] array = new Menu[inputNum];//当前目录子目录数组初始化

        //初始化根目录下子目录
        for(int i = 1; i <= newMenu.getSubMenuCount(); i++){
            Menu subMenu = new Menu();
            System.out.printf("请输入第%d个子目录名：\n",i);
            Scanner sc = new Scanner(System.in);
            subMenu.setName(sc.nextLine());
            subMenu.setLevel(CurrentMenu.currentLevel);//新建的子目录level默认和当前目录一致，只有在子目录下继续拓展子目录时，子目录的level才会变
            array[i - 1] = subMenu;
        }
        newMenu.setSubMenuArray(array);
        return newMenu;
    }

    public static void connectWithFatherMenu(Menu newMenu) {
        //将当前目录与上一级目录连接起来，双向链表
        if(CurrentMenu.currentLevel == 1){
            CurrentMenu.home = newMenu;
        }else{
            CurrentMenu.father.getSubMenuArray()[newMenu.getIdInFatherMenu() - 1] = newMenu;
            newMenu.setFatherMenu(CurrentMenu.father);
        }
    }

    public static void printCurrentMenu(Menu newMenu) {
        System.out.printf("当前目录：%s  目录等级：%d\n", newMenu.getName(), newMenu.getLevel());
        for (int i = 1; i <= newMenu.getSubMenuCount(); i++) {
            System.out.printf("%d.%s\n", i, newMenu.getSubMenuArray()[i - 1].getName());
        }
    }

    public static int getTestOrEdit() {
        System.out.println("是否完成目录编辑？1.是，开始进行测试  2.否，继续编辑");
        Scanner scanner1 = new Scanner(System.in);
        int input1 = scanner1.nextInt();
        scanner1.nextLine();
        return input1;
    }

    public static int getBackOrEdit() {
        System.out.println("请输入要编辑的子目录编号：(输入0返回上一级目录)");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.nextLine();
        return input;
    }

    public static Menu backToFatherMenu(Menu newMenu) {
        //返回上一级，运用链表知识
        CurrentMenu.father = newMenu.getFatherMenu().getFatherMenu();
        newMenu = newMenu.getFatherMenu();
        CurrentMenu.currentLevel--;//若返回上一级，currentlevel要减1，因为返回上一级后再继续编辑下一级要保证level正确
        return newMenu;
    }

    public static void editSubMenu(Menu newMenu, int input) {
        CurrentMenu.father = newMenu;
        CurrentMenu.currentIdInFatherMenu = input;
        CurrentMenu.currentLevel++;
        CurrentMenu.currentName = CurrentMenu.father.getSubMenuArray()[CurrentMenu.currentIdInFatherMenu - 1].getName();
    }
}
