package demo10;

public class Main {
    public static void main(String[] args) {
        PrimaryStudent ps = new PrimaryStudent();
        MiddleStudent ms = new MiddleStudent();
        SeniorStudent ss = new SeniorStudent();
        ps.study();
        ms.study();
        ss.study();
    }
}
