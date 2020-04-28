package demo06;

public class Person {
    private String name;
    private int age;
    private static int count = 0;
    private static int conCount = 0;
    {
        ++count;
    }

    public static int getConCount() {
        return conCount;
    }

    public static void setConCount(int conCount) {
        Person.conCount = conCount;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        ++conCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

