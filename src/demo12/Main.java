package demo12;

public class Main {
    public static void main(String[] args) {
        while (CurrentMenu.isEdit == 1) {//此时为编辑状态
            Menu newMenu = EditStatusMethods.initCurrentMenu();//初始化一个Menu，初始化当前目录的名字，等级，在上一层目录中编号，子目录数，子目录名，子目录等级
            EditStatusMethods.connectWithFatherMenu(newMenu);//将当前目录与father目录连接起来，类似双向链表

            while (true) {
                System.out.println("当前状态：编辑状态");
                //打印出当前菜单内容
                EditStatusMethods.printCurrentMenu(newMenu);//打印当前目录
                int input1 = EditStatusMethods.getTestOrEdit();//询问测试还是继续编辑，测试返回1，继续编辑返回2
                if (input1 == 1) {
                    CurrentMenu.isEdit = 0;//如果开始进行测试，则退出编辑状态
                    break;
                } else {//继续编辑，此时isEdit仍为1
                    int input = EditStatusMethods.getBackOrEdit();//返回上一级返回0，编辑子目录返回子目录编号
                    if (input == 0) {
                        if (CurrentMenu.currentLevel == 1) {
                            System.out.println("当前已经是根目录");
                            continue;
                        }
                        newMenu = EditStatusMethods.backToFatherMenu(newMenu);//返回上一个目录，即继续进行while循环，此处必须要返回到newMenu,不然更改的只是传入的参数,原来的newMenu不会变
                    } else {//继续编辑其中一个子目录
                        if (input < 0 || input > newMenu.getSubMenuCount()) {
                            System.out.println("输入不合法");
                            continue;
                        }
                        EditStatusMethods.editSubMenu(newMenu, input);//当前目录变为父目录，下一个循环中新目录的等级，目录名，在上级目录中的编号随之改变
                        break;
                    }
                }
            }
        }

        //走到这一步说明isEdit = 0，当前为测试状态
        CurrentMenu.father = CurrentMenu.home;
        TestStatusMethods.testMenuCreationTool();
    }
}