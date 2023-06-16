package day8;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String firstname;
    private String lastname;
    private String dateofbirth;

    public Person(String firstname, String lastname, String dateofbirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }

    public String getFirstname() {
        return firstname;
    }
}
