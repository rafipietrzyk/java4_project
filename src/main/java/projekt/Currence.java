package projekt;

import java.util.Date;

public class Currence {
    private Date data;
    private double rate;

    public Currence(Date data, double rate) {
        this.data = data;
        this.rate = rate;
    }

    public Date getData() {
        return data;
    }

    public double getRate() {
        return rate;
    }
}
