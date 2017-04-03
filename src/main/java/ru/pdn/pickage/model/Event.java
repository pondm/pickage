package ru.pdn.pickage.model;

import java.io.Serializable;

public class Event extends GenericObject implements Serializable {
    private String datetime;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "datetime='" + datetime + '\'' +
                '}';
    }
}
