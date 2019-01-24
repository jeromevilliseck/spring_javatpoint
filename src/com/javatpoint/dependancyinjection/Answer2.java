package com.javatpoint.dependancyinjection;

import java.util.Date;

public class Answer2 extends GenericAnswer {
    private Date postedDate;

    public Answer2(int id, String name, Date postedDate) {
        super(id, name);
        this.postedDate = postedDate;
    }

    @Override
    public String toString() {
        return "Answer2{" +
                "postedDate=" + postedDate +
                '}';
    }
}
