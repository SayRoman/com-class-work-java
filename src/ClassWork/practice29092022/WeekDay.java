package ClassWork.practice29092022;

public enum WeekDay {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    WeekDay(String day) {
        this.day = day;
    }

    private final String day;

    String getDay() {
        return day;
    }
}

