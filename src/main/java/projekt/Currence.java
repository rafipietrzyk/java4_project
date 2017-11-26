package projekt;

import java.util.Date;

public class Currence {
    private Date date;
    private double rate;

    public Currence(Date date, double rate) {
        this.date = date;
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
}
