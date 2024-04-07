package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int yeat, int month, int day) {
        this.year = yeat;
        this.month = month;
        this.day = day;
    }


    public ImmutableMyDate withYear(int newyear) {
       return new ImmutableMyDate(newyear, month, day);
    }


    public ImmutableMyDate wirhMonth(int newmonth) {
        return new ImmutableMyDate(year, newmonth, day);
    }


    public ImmutableMyDate withDay(int newday) {
       return new ImmutableMyDate(year, month, newday);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
