public class Main {
    public static void main(String[] args) {
    Day today = Day.SUNDAY;
    boolean isWeekend = today.isWeekend();
    System.out.println(isWeekend);
    String getRusname = today.getRusName();
    System.out.println(getRusname);

    }
}
enum  Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend() {
        switch (this) {
            case SATURDAY, SUNDAY:
                return true;
            default:
                return false;
        }
    }
    public String getRusName(){
        switch (this) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
            default:
                return "Некорректный день";
        }
    }
}