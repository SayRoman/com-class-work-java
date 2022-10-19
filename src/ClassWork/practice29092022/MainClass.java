package ClassWork.practice29092022;

public class MainClass {
    public static void main(String[] args) {
        VerifyDay verifyDay = new VerifyDay();
        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay weekday : weekDays) {
            verifyDay.verifyDay(weekday);
        }
    }
}
