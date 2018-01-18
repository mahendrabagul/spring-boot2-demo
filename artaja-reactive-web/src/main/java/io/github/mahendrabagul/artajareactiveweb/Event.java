package io.github.mahendrabagul.artajareactiveweb;

import java.util.Date;

public class Event {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event(long id, Date date) {
        this.id = id;
        this.date = date;
    }

    private long id;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
