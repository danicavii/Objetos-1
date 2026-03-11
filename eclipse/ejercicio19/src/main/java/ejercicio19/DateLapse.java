package ejercicio19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("La fecha 'from' debe ser anterior o igual a 'to'");
        }
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return this.from;
    }

    public LocalDate getTo() {
        return this.to;
    }

    public int sizeInDays() {
        return (int) ChronoUnit.DAYS.between(from, to);
    }

    public boolean includesDate(LocalDate other) {
        return (other.equals(from) || other.equals(to) || 
                (other.isAfter(from) && other.isBefore(to)));
    }
    
    public boolean overlaps(DateLapse anotherDateLapse) {
        return this.from.isBefore(anotherDateLapse.getTo()) &&
               anotherDateLapse.getFrom().isBefore(this.to);
    }
}