package demo12;

public class Menu {
    private int subMenuCount;//子目录数
    private int level;//目录所在等级
    private String name;//目录名
    private Menu[] subMenuArray;//子目录组成的数组
    private Menu fatherMenu;//当前目录的父目录
    private int idInFatherMenu;//当前目录在上一层目录中的编号


    public int getSubMenuCount() {
        return subMenuCount;
    }

    public void setSubMenuCount(int subMenuCount) {
        this.subMenuCount = subMenuCount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu[] getSubMenuArray() {
        return subMenuArray;
    }

    public void setSubMenuArray(Menu[] subMenuArray) {
        this.subMenuArray = subMenuArray;
    }

    public int getIdInFatherMenu() {
        return idInFatherMenu;
    }

    public void setIdInFatherMenu(int idInFatherMenu) {
        this.idInFatherMenu = idInFatherMenu;
    }

    public Menu getFatherMenu() {
        return fatherMenu;
    }

    public void setFatherMenu(Menu fatherMenu) {
        this.fatherMenu = fatherMenu;
    }

}
