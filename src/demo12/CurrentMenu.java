package demo12;

public class CurrentMenu {
    static int currentLevel = 1;//当前目录等级
    static String currentName = "根目录";//当前目录名
    static int currentIdInFatherMenu = 1;//当前目录在上一层目录中编号
    static Menu home = new Menu();//总目录
    static Menu father = new Menu();//当前目录的上一层目录
    static int isEdit = 1;
}
