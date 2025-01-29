public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay) {
        if (newDay >= 1 && newDay <= 31) {
            day = newDay;
        }
    }

    public void setMonth(int newMonth) {
        if (newMonth >= 1 && newMonth <= 12) {
            month = newMonth;
        }
    }

    public void setYear(int newYear) {
         year = newYear;
    }


    public void setDate(int newDay, int newMonth, int newYear) {
        setDay(newDay);
        setMonth(newMonth);
        setYear(newYear);
    }

    public String toString() {
        int day = getDay();
        int month = getMonth();
        int year = getYear();

        return day + "/" + month + "/" + year;
    }
}
