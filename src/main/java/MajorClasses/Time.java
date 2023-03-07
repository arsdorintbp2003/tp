package MajorClasses;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {
    // This class is used to deal with the initialization, access, and change of DateTime
    protected LocalDate date;

    public Time(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


}
