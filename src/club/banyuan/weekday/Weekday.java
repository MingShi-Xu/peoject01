package club.banyuan.weekday;

public enum Weekday {

    MONDAY("星期一",false),
    TUESDAY("星期二",false),
    WEDNESDAY("星期三",false),
    THURSDAY("星期四",false),
    FRIDAY("星期五",false),
    SATURDAY("星期六",true),
    SUNDAY("星期日",true);

    private final String weekDayName;
    private final boolean isHoliday;

    Weekday(String weekDayName,boolean isHoliday){
        this.weekDayName = weekDayName;
        this.isHoliday = isHoliday;
    }

    public boolean isWeekDay() {
        return !isHoliday();
    }

    public boolean isHoliday() {
        return  isHoliday;
    }

    @Override
    public String toString(){
        return weekDayName;
    }
}
