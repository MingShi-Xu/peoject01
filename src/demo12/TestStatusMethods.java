package demo12;

import java.util.Scanner;

public class TestStatusMethods {
    public static void testMenuCreationTool() {
        while (true){
            System.out.println("当前状态：测试状态");
            //father为当前目录
            EditStatusMethods.printCurrentMenu(CurrentMenu.father);//打印当前目录
            int input = getBackOrEdit();//询问返回上一级还是进入子目录，返回上级返回0，进入子目录返回子目录编号，输入-1直接退出程序
            if(input < -1 || input > CurrentMenu.father.getSubMenuCount()){
                System.out.println("输入不合法");
                System.out.println();//如果输入不合法，回到while()继续显示当前目录
            }else if(input == 0){
                if(CurrentMenu.father.getLevel() == 1){
                    System.out.println("当前已经是根目录");
                    continue;
                }
                CurrentMenu.father = CurrentMenu.father.getFatherMenu();//father变为上一级目录
            }else if(input != -1){//输入了正确目录编号
                if(CurrentMenu.father.getSubMenuArray()[input -1].getLevel() == CurrentMenu.father.getLevel()){//如果选中的子目录level和当前目录level一致，则选中的子目录已经没有子目录了
                    System.out.println("选中目录没有子目录");
                    continue;
                }
                CurrentMenu.father = CurrentMenu.father.getSubMenuArray()[input - 1];//father变为选中的下一级目录
            }else {//input = -1
                System.exit(0);
            }
        }
    }

    public static int getBackOrEdit() {
        System.out.println("请输入目录编号：(输入0返回上一级，输入-1结束程序)");
        Scanner scanner2 = new Scanner(System.in);
        int input = scanner2.nextInt();
        scanner2.nextLine();
        return input;
    }
}
