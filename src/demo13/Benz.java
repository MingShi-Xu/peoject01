package demo13;

public class Benz extends Car {

    @Override
    public void run(){
        System.out.println("奔驰在跑");
    }

    public static void main(String[] args){
        Car car = (Car)(new Benz());
        car.run();
    }
}
