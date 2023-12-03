package com.siyu.liu.eventcreatorbackend.event;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class EventCreateDTO {
    @Getter
    @Setter
    @NotBlank
    private String eventName;

    @NotBlank
    @Getter
    @Setter
    private String startDate;

    @NotBlank
    @Getter
    @Setter
    private String startTime;

    @NotBlank
    @Getter
    @Setter
    private String endDate;
    
    @NotBlank
    @Getter
    @Setter
    private String endTime;

    @NotBlank
    @Getter
    @Setter
    private String location;

    @Getter
    @Setter
    private String[] label;
}
