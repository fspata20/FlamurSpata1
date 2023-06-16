package day8;

import java.util.Date;

public class Trainer extends Person{
    private boolean isAuthorized;

    public Trainer(String firstname, String lastname, String dateofbirth, boolean isAuthorized) {
        super(firstname, lastname, dateofbirth);
        this.isAuthorized = isAuthorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }
}
