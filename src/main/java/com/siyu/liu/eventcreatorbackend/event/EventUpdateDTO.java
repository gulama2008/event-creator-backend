package com.siyu.liu.eventcreatorbackend.event;

import lombok.Getter;
import lombok.Setter;

public class EventUpdateDTO {
    @Getter
    @Setter   
    private String eventName;
  
    @Getter
    @Setter
    private String startDate;
 
    @Getter
    @Setter
    private String startTime;
   
    @Getter
    @Setter
    private String endDate;  
   
    @Getter
    @Setter
    private String endTime;
 
    @Getter
    @Setter
    private String location;

    @Getter
    @Setter
    private String label;
}
