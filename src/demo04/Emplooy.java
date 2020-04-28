package demo04;

public class Emplooy {
    int hours,salarys;
    String name;
    public int setHours(int hour){
        return hour;
    }
    public int cal(){
       if(hours >= 196){
           return (hours - 196) * 200 + salarys;
       } else{
           return salarys;
       }
    }
}
