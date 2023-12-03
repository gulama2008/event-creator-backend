package com.siyu.liu.eventcreatorbackend.event;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "events")
public class Event {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Getter
    @Setter
    private String eventName;

    @Column
    @Getter
    @Setter
    private String startDate;

    @Column
    @Getter
    @Setter
    private String startTime;

    @Column
    @Getter
    @Setter
    private String endDate;
    
    @Column
    @Getter
    @Setter
    private String endTime;

    @Column
    @Getter
    @Setter
    private String location;

    @Column
    @Getter
    @Setter
    private String[] label;

    public Event() {
    }
    
    public Event(String eventName, String startDate,String startTime, String endDate, String endTime, String location, String[] label) {
    this.eventName = eventName;
    this.startDate = startDate;
    this.startTime = startTime;
    this.endDate = endDate;
    this.endTime = endTime;
    this.location = location;
    this.label = label;
}
}
