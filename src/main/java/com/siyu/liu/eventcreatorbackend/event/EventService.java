package com.siyu.liu.eventcreatorbackend.event;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Event> getAll() {
        return this.eventRepository.findAll();
    }

    public Optional<Event> getById(Long id) {
        return this.eventRepository.findById(id);
    }

    public Event createEvent(EventCreateDTO data) {
        String eventName=data.getEventName();
        String startDate=data.getStartDate();
        String startTime=data.getStartTime();
        String endDate=data.getEndDate();
        String endTime=data.getEndTime();
        String location=data.getLocation();
        String[] label=data.getLabel();
        Event newEvent = new Event(eventName, startDate, startTime, endDate, endTime, location, label);
        // Event newEvent = modelMapper.map(data, Event.class);
        Event created = this.eventRepository.save(newEvent);
        return created;
    }

    public boolean deleteById(Long id) {
        Optional<Event> foundEvent = this.eventRepository.findById(id);
        if (foundEvent.isPresent()) {
            this.eventRepository.delete(foundEvent.get());
            return true;
        }
        return false;
    }
    
    public Optional<Event> updateById(Long id, EventUpdateDTO data) {
    Optional<Event> foundEvent = this.getById(id);
    if (foundEvent.isPresent()) {
        
        Event toUpdate = foundEvent.get();
        toUpdate.setEventName(data.getEventName());
        toUpdate.setStartDate(data.getStartDate());
        toUpdate.setStartTime(data.getStartTime());
        toUpdate.setEndDate(data.getEndDate());
        toUpdate.setEndTime(data.getEndTime());
        toUpdate.setEventName(data.getEventName());
        toUpdate.setLocation(data.getLocation());
        toUpdate.setLabel(data.getLabel());
        Event updatedEvent = this.eventRepository.save(toUpdate);
        return Optional.of(updatedEvent);
    }
	return foundEvent;
}
}
