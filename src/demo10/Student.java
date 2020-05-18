package demo10;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println("都具有学习的方法");
    }
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
}
